package net.leanix.dropkit.apiclient.auth;

import java.net.URI;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.auth.responses.AccessTokenResponse;

public class PersonalAccessTokenOAuth extends AbstractRefreshingOAuth {

    private String personalAccessToken;

    public void setPersonalAccessToken(String personalAccessToken, URI tokenUrl) {
        this.personalAccessToken = personalAccessToken;
        this.tokenUrl = tokenUrl;
    }

    @Override
    void fetchToken() throws ApiException {

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
