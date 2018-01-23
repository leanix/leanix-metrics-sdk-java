package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.Configuration;
import net.leanix.dropkit.apiclient.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.metrics.api.models.BasicResponse;
import net.leanix.metrics.api.models.DemoDataRequest;
import net.leanix.metrics.api.models.Point;
import net.leanix.metrics.api.models.PointResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PointsApi {
  private ApiClient apiClient;

  public PointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PointsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * createDemoPoints
   * Endpoint to create a measurement with demo points
   * @param demoDataRequest  (required)
   * @return BasicResponse
   * @throws ApiException if fails to make API call
   */
  public BasicResponse createDemoPoints(DemoDataRequest demoDataRequest) throws ApiException {
    Object localVarPostBody = demoDataRequest;
    
    // verify the required parameter 'demoDataRequest' is set
    if (demoDataRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'demoDataRequest' when calling createDemoPoints");
    }
    
    // create path and map variables
    String localVarPath = "/points/createDemoPoints";

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

    GenericType<BasicResponse> localVarReturnType = new GenericType<BasicResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * createPoint
   * Endpoint to create a new data point
   * @param point a time series data point to store (required)
   * @return PointResponse
   * @throws ApiException if fails to make API call
   */
  public PointResponse createPoint(Point point) throws ApiException {
    Object localVarPostBody = point;
    
    // verify the required parameter 'point' is set
    if (point == null) {
      throw new ApiException(400, "Missing the required parameter 'point' when calling createPoint");
    }
    
    // create path and map variables
    String localVarPath = "/points";

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

    GenericType<PointResponse> localVarReturnType = new GenericType<PointResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
