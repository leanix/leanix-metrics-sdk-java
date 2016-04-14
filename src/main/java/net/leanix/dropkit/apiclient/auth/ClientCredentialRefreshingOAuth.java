package net.leanix.dropkit.apiclient.auth;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;
import org.glassfish.jersey.internal.util.Base64;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.Pair;
import net.leanix.dropkit.apiclient.auth.responses.AccessTokenResponse;

public class ClientCredentialRefreshingOAuth extends OAuth {

    private static final Charset UTF8 = Charset.forName("UTF-8");

    private boolean accessTokenSetManually = false;

    private Client jerseyClient;

    private URI tokenUrl;

    private String clientId;
    private String clientSecret;

    private AccessTokenResponse accessTokenResponse;

    public ClientCredentialRefreshingOAuth() {
    }

    public void setClient(Client jerseyClient) {
        this.jerseyClient = jerseyClient;
    }

    public void setClientCredentials(String clientId, String clientSecret, URI tokenUrl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;

        this.tokenUrl = tokenUrl;
    }

    @Override
    public void setAccessToken(String accessToken) {
        // If the access token is set manually here, don't do
        // the token refresh via client credential flow anymore.
        accessTokenSetManually = accessToken != null;
        accessTokenResponse = null;
        super.setAccessToken(accessToken);
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
        // If the access token is set manually, don't do
        // the token refresh via client credential flow anymore.
        if (!accessTokenSetManually && !StringUtils.isEmpty(clientId)) {
            // skip this authentication if access token is set manually and no clientId is specified
            if (accessTokenResponse == null || accessTokenResponse.isExpired()) {
                fetchToken();

                // call super to avoid setting the "manually set" flag
                super.setAccessToken(accessTokenResponse.getAccessToken());
            }
        }
        super.applyToParams(queryParams, headerParams);
    }

    private String buildBasicAuthorizationHeader(String clientId, String clientSecret) {
        StringBuilder sb = new StringBuilder(512);
        sb.append(clientId).append(':').append(clientSecret);
        String userAndPw = sb.toString();

        sb.setLength(0);
        sb.append("Basic ").append(
                Base64.encodeAsString(userAndPw.getBytes(UTF8)));
        return sb.toString();
    }

    private void fetchToken() throws ApiException {
        String basicAuthorizationHeader = buildBasicAuthorizationHeader(clientId, clientSecret);

        try {
            accessTokenResponse = jerseyClient
                    .target(tokenUrl)
                    .queryParam("grant_type", "client_credentials")
                    .request(MediaType.APPLICATION_FORM_URLENCODED/* MediaType.APPLICATION_JSON */)
                    .accept(MediaType.APPLICATION_JSON)
                    // .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                    .header(HttpHeaders.AUTHORIZATION, basicAuthorizationHeader)
                    .post(null, AccessTokenResponse.class);
        } catch (RuntimeException ex) {
            throw new ApiException("Failed to retrieve a new oauth token from " + tokenUrl, ex, 0, null);
        }
    }
}
