package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.Configuration;
import net.leanix.dropkit.apiclient.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.metrics.api.models.MeasurementResponse;
import net.leanix.metrics.api.models.MeasurementListResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MeasurementsApi {
  private ApiClient apiClient;

  public MeasurementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MeasurementsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * deleteMeasurement
   * Deletes a measurement
   * @param name The name of the measurement (required)
   * @param workspaceId WorkspaceID in UUID format (optional)
   * @return MeasurementResponse
   * @throws ApiException if fails to make API call
   */
  public MeasurementResponse deleteMeasurement(String name, String workspaceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deleteMeasurement");
    }
    
    // create path and map variables
    String localVarPath = "/measurements/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "pat", "token" };

    
    GenericType<MeasurementResponse> localVarReturnType = new GenericType<MeasurementResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * getMeasurements
   * Endpoint to retrieve all measurements
   * @param q Query for measurements, e.g. tagKey = &#39;tagValue&#39; (optional)
   * @param workspaceId WorkspaceID in UUID format (optional)
   * @return MeasurementListResponse
   * @throws ApiException if fails to make API call
   */
  public MeasurementListResponse getMeasurements(String q, String workspaceId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/measurements".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] { "pat", "token" };

    
    GenericType<MeasurementListResponse> localVarReturnType = new GenericType<MeasurementListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
