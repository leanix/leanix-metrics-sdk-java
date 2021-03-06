/*
 * LeanIX Metrics REST API
 * Stores and retrieves metrics
 *
 * OpenAPI spec version: 0.3.3-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.metrics.api;

import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.metrics.api.models.BasicResponse;
import net.leanix.metrics.api.models.DemoDataRequest;
import net.leanix.metrics.api.models.Point;
import net.leanix.metrics.api.models.PointResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PointsApi
 */
@Ignore
public class PointsApiTest {

    private final PointsApi api = new PointsApi();

    
    /**
     * createDemoPoints
     *
     * Endpoint to create a measurement with demo points
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDemoPointsTest() throws ApiException {
        DemoDataRequest demoDataRequest = null;
        BasicResponse response = api.createDemoPoints(demoDataRequest);

        // TODO: test validations
    }
    
    /**
     * createPoint
     *
     * Endpoint to create a new data point
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPointTest() throws ApiException {
        Point point = null;
        PointResponse response = api.createPoint(point);

        // TODO: test validations
    }
    
}
