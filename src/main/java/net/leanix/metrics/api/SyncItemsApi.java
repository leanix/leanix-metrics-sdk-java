package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.Configuration;
import net.leanix.dropkit.apiclient.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.metrics.api.models.SyncItemListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SyncItemsApi {
  private ApiClient apiClient;

  public SyncItemsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SyncItemsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * getSyncItems
   * Endpoint to list the syncItems.
   * @param workspaceId  (optional)
   * @param synchronizationId SynchronizationId (optional)
   * @param q Query string to search the syncItems (optional)
   * @param sourceId SourceId of the syncItem (optional)
   * @param sourceTypePrefix Prefix of the syncItem&#39;s sourceType (e.g. leanix when type is leanix.process) (optional)
   * @param targetId TargetId of the syncItem (optional)
   * @param targetTypePrefix Prefix of the syncItem&#39;s targetType (e.g. leanix when type is leanix.process) (optional)
   * @param page The page number to access (1 indexed, defaults to 1) (optional, default to 1)
   * @param size The page size requested (defaults to 30, max 100) (optional, default to 30)
   * @param sort Comma-separated list of sorting (default createdAt-DESC) (optional, default to createdAt-desc)
   * @return SyncItemListResponse
   * @throws ApiException if fails to make API call
   */
  public SyncItemListResponse getSyncItems(String workspaceId, String synchronizationId, String q, String sourceId, String sourceTypePrefix, String targetId, String targetTypePrefix, Integer page, Integer size, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/syncItems".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "synchronizationId", synchronizationId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceId", sourceId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceTypePrefix", sourceTypePrefix));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetId", targetId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetTypePrefix", targetTypePrefix));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<SyncItemListResponse> localVarReturnType = new GenericType<SyncItemListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
