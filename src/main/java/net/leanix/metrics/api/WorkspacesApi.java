package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.Configuration;
import net.leanix.dropkit.apiclient.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.metrics.api.models.MeasurementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WorkspacesApi {
  private ApiClient apiClient;

  public WorkspacesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WorkspacesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * deleteMeasurementOfWorkspace
   * Deletes all measurements of a workspace
   * @param wsId WorkspaceID in UUID format (required)
   * @return MeasurementResponse
   * @throws ApiException if fails to make API call
   */
  public MeasurementResponse deleteMeasurementOfWorkspace(String wsId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'wsId' is set
    if (wsId == null) {
      throw new ApiException(400, "Missing the required parameter 'wsId' when calling deleteMeasurementOfWorkspace");
    }
    
    // create path and map variables
    String localVarPath = "/workspaces/{wsId}"
      .replaceAll("\\{" + "wsId" + "\\}", apiClient.escapeString(wsId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<MeasurementResponse> localVarReturnType = new GenericType<MeasurementResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
