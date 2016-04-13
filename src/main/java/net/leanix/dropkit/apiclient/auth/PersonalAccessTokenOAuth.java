package net.leanix.dropkit.apiclient.auth;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.StringUtils;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.Pair;
import net.leanix.dropkit.apiclient.auth.responses.AccessTokenResponse;

public class PersonalAccessTokenOAuth extends OAuth {

    private Client jerseyClient;
    private String personalAccessToken;
    private URI tokenUrl;

    private AccessTokenResponse accessTokenResponse;

    public void setClient(Client jerseyClient) {
        this.jerseyClient = jerseyClient;
    }

    public void setPersonalAccessToken(String personalAccessToken, URI tokenUrl) {
        this.personalAccessToken = personalAccessToken;
        this.tokenUrl = tokenUrl;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
        if (StringUtils.isEmpty(personalAccessToken)) {
            // nothing to do for this type
            return;
        }

        if ((accessTokenResponse == null || accessTokenResponse.isExpired())) {
            fetchToken();
            super.setAccessToken(accessTokenResponse.getAccessToken());
        }
        super.applyToParams(queryParams, headerParams);
    }

    private void fetchToken() throws ApiException {

        try {
            accessTokenResponse = jerseyClient
                    .target(tokenUrl)
                    .request(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .post(Entity.json(personalAccessToken), AccessTokenResponse.class);
        } catch (RuntimeException ex) {
            throw new ApiException("Failed to retrieve a new oauth token from " + tokenUrl, ex, 0, null);
        }
    }

}
