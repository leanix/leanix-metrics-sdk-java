package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.Configuration;
import net.leanix.dropkit.apiclient.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.metrics.api.models.SyncItemListResponse;
import net.leanix.metrics.api.models.SyncItemBatch;
import net.leanix.metrics.api.models.SynchronizationResponse;
import net.leanix.metrics.api.models.Synchronization;
import net.leanix.metrics.api.models.SynchronizationListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SynchronizationsApi {
  private ApiClient apiClient;

  public SynchronizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SynchronizationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * addSyncItemBatch
   * Endpoint to add new items
   * @param id id of the synchronization to modify (required)
   * @param body A batch of synchronization items to add to the synchronization (required)
   * @return SynchronizationResponse
   * @throws ApiException if fails to make API call
   */
  public SynchronizationResponse addSyncItemBatch(String id, SyncItemBatch body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling addSyncItemBatch");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling addSyncItemBatch");
    }
    
    // create path and map variables
    String localVarPath = "/synchronizations/{id}/syncItemBatch".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<SynchronizationResponse> localVarReturnType = new GenericType<SynchronizationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * createSynchronization
   * Endpoint to create an synchronization.
   * @param body new synchronization (required)
   * @return SynchronizationResponse
   * @throws ApiException if fails to make API call
   */
  public SynchronizationResponse createSynchronization(Synchronization body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createSynchronization");
    }
    
    // create path and map variables
    String localVarPath = "/synchronizations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<SynchronizationResponse> localVarReturnType = new GenericType<SynchronizationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getSyncItems
   * Endpoint to list the items
   * @param id  (required)
   * @param page The page number to access (1 indexed, defaults to 1) (optional, default to 1)
   * @param size The page size requested (defaults to 30, max 100) (optional, default to 30)
   * @param sort Comma-separated list of sorting (default createdAt-DESC) (optional, default to createdAt-desc)
   * @return SyncItemListResponse
   * @throws ApiException if fails to make API call
   */
  public SyncItemListResponse getSyncItems(String id, Integer page, Integer size, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSyncItems");
    }
    
    // create path and map variables
    String localVarPath = "/synchronizations/{id}/syncItems".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
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
  
  /**
   * getSynchronization
   * Endpoint to get a specific synchronization.
   * @param id  (required)
   * @return SynchronizationResponse
   * @throws ApiException if fails to make API call
   */
  public SynchronizationResponse getSynchronization(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getSynchronization");
    }
    
    // create path and map variables
    String localVarPath = "/synchronizations/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<SynchronizationResponse> localVarReturnType = new GenericType<SynchronizationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getSynchronizations
   * Endpoint to list the synchronizations.
   * @param workspaceId  (optional)
   * @param userId  (optional)
   * @param topic  (optional)
   * @param page The page number to access (1 indexed, defaults to 1) (optional, default to 1)
   * @param size The page size requested (defaults to 30, max 100) (optional, default to 30)
   * @param sort Comma-separated list of sorting (default createdAt-DESC) (optional, default to createdAt-desc)
   * @return SynchronizationListResponse
   * @throws ApiException if fails to make API call
   */
  public SynchronizationListResponse getSynchronizations(String workspaceId, String userId, String topic, Integer page, Integer size, String sort) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/synchronizations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "topic", topic));
    
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

    
    GenericType<SynchronizationListResponse> localVarReturnType = new GenericType<SynchronizationListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * updateSynchronization
   * Endpoint to update an synchronization.
   * @param id  (required)
   * @param body new synchronization value (required)
   * @return SynchronizationResponse
   * @throws ApiException if fails to make API call
   */
  public SynchronizationResponse updateSynchronization(String id, Synchronization body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateSynchronization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSynchronization");
    }
    
    // create path and map variables
    String localVarPath = "/synchronizations/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<SynchronizationResponse> localVarReturnType = new GenericType<SynchronizationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
