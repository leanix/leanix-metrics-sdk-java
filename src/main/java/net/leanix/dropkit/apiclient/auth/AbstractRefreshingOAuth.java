package net.leanix.dropkit.apiclient.auth;

import java.net.URI;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.Pair;
import net.leanix.dropkit.apiclient.auth.responses.AccessTokenResponse;

public abstract class AbstractRefreshingOAuth extends OAuth {

    private boolean accessTokenSetManually = false;

    Client jerseyClient;

    URI tokenUrl;

    AccessTokenResponse accessTokenResponse;

    public void setClient(Client jerseyClient) {
        this.jerseyClient = jerseyClient;
    }

    @Override
    public void setAccessToken(String accessToken) {
        // If the access token is set manually here, don't do the token refresh via client credential flow anymore.
        accessTokenSetManually = (accessToken != null);
        accessTokenResponse = null;
        super.setAccessToken(accessToken);
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
        // If the access token is set manually, don't do the token refresh via client credential flow anymore.
        // And, if no url to retrieve a fresh token is specified we can skip fetching as well.
        if (!accessTokenSetManually && tokenUrl != null) {
            if (accessTokenResponse == null || accessTokenResponse.isExpired()) {
                fetchToken();

                // call super to avoid setting the "manually set" flag
                super.setAccessToken(accessTokenResponse.getAccessToken());
            }
        }
        super.applyToParams(queryParams, headerParams);
    }

    abstract void fetchToken() throws ApiException;
}
