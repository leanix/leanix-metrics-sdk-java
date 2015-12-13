/*
* The MIT License (MIT)	 
*
* Copyright (c) 2015 LeanIX GmbH
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of
* this software and associated documentation files (the "Software"), to deal in
* the Software without restriction, including without limitation the rights to
* use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
* the Software, and to permit persons to whom the Software is furnished to do so,
* subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
* FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
* COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
* IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
* CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package net.leanix.metrics.api;

import net.leanix.dropkit.api.Client;
import net.leanix.dropkit.api.ApiException;
import net.leanix.dropkit.api.ValidationException;
import net.leanix.dropkit.api.Response;
import net.leanix.metrics.api.models.MeasurementListResponse;
import net.leanix.metrics.api.models.MeasurementResponse;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MeasurementsApi {
    private Client apiClient;

    public MeasurementsApi(Client client) {
        if (client == null)
            throw new IllegalArgumentException("client is null");

        this.apiClient = client;
    }

    public Client getClient() {
        return this.apiClient;
    }

    private static MultivaluedMap<String, String> buildmvm(Map<String, String> map) {
        MultivaluedMapImpl mvMap = new MultivaluedMapImpl();
        for (Map.Entry<String, String> entry: map.entrySet()) {
            mvMap.add(entry.getKey(), entry.getValue());
        }
        return mvMap;
    }

    /**
     * getMeasurements.
     * Endpoint to retrieve all measurements
     *
     * @throws ApiException
     */
    public MeasurementListResponse getMeasurements (String workspaceId) throws ApiException {
        // create path and map variables
        String path = "/measurements".replaceAll("\\{format\\}","json");

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        if(!"null".equals(String.valueOf(workspaceId)))
        queryParams.put("workspaceId", String.valueOf(workspaceId));
        Map<String, String> headerParams = new HashMap<String, String>();
        try {
            return apiClient.resource(path)
                .queryParams(buildmvm(queryParams))
                .method("GET", MeasurementListResponse.class);
        } catch (UniformInterfaceException ex) {
            if (ex.getResponse().getStatus() == 404) {
                return null;
            } else if(ex.getResponse().getStatus() == 422) {
                throw new ValidationException(ex.getResponse().getEntity(Response.class));
            } else {
                throw new ApiException(ex.getResponse().getStatus(), ex.getResponse().toString());
            }
        }
    }
    /**
     * deleteMeasurement.
     * Deletes a measurement
     *
     * @throws ApiException
     */
    public MeasurementResponse deleteSubscription (String workspaceId, String name) throws ApiException {
        // verify required params are set
        if(name == null ) {
            throw new ApiException(400, "missing required params");
        }
        // create path and map variables
        String path = "/measurements/{name}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "name" + "\\}", name.toString());

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        if(!"null".equals(String.valueOf(workspaceId)))
        queryParams.put("workspaceId", String.valueOf(workspaceId));
        Map<String, String> headerParams = new HashMap<String, String>();
        try {
            return apiClient.resource(path)
                .queryParams(buildmvm(queryParams))
                .method("DELETE", MeasurementResponse.class);
        } catch (UniformInterfaceException ex) {
            if (ex.getResponse().getStatus() == 404) {
                return null;
            } else if(ex.getResponse().getStatus() == 422) {
                throw new ValidationException(ex.getResponse().getEntity(Response.class));
            } else {
                throw new ApiException(ex.getResponse().getStatus(), ex.getResponse().toString());
            }
        }
    }
    }

