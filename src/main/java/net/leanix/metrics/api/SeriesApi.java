package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.Configuration;
import net.leanix.dropkit.apiclient.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.metrics.api.models.SeriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SeriesApi {
  private ApiClient apiClient;

  public SeriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SeriesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * getSeries
   * Endpoint to query results
   * @param q  (optional)
   * @param workspaceId  (optional)
   * @return SeriesResponse
   * @throws ApiException if fails to make API call
   */
  public SeriesResponse getSeries(String q, String workspaceId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/series".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<SeriesResponse> localVarReturnType = new GenericType<SeriesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
