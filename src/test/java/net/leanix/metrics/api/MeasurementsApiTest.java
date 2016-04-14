package net.leanix.metrics.api;

import static org.assertj.core.api.Assertions.*;

import java.util.logging.LogManager;

import javax.ws.rs.ForbiddenException;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.bridge.SLF4JBridgeHandler;

import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.ApiClientBuilder;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.metrics.api.models.MeasurementListResponse;

public class MeasurementsApiTest {

    Logger LOG = LoggerFactory.getLogger(MeasurementsApiTest.class);

    final String WORKSPACE_ID = System.getProperty("workspaceId"/* , "4846d3f1-ca14-4571-9367-ebc23ca25a47" */);
    final String codeGenHost = System.getProperty("codegenHost", "boot2docker.leanix.net");
    final String validPas = System.getProperty("pas", "rwe123");

    ApiClient apiClient;

    @Before
    public void setUp() {

        Assume.assumeTrue(StringUtils.isNotEmpty(WORKSPACE_ID));

        LogManager.getLogManager().reset();
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();

        apiClient = new ApiClientBuilder()
                .withBasePath(String.format("https://%s/services/metrics/v1", codeGenHost))
                .withTokenProviderHost(codeGenHost)
                .withPersonalAccessToken(validPas)
                .withDebugging(true).build();
    }

    @Test
    public void test_setClientCredentials_getSynchronization_withValidClientSecret() throws ApiException {
        MeasurementsApi synchronizationsApi = new MeasurementsApi(apiClient);

        MeasurementListResponse measurements = synchronizationsApi.getMeasurements("", WORKSPACE_ID);

        System.out.println("Found measurements: \n" + measurements);
        assertThat(measurements.getData()).isNotEmpty();
    }

    @Test(expected = ForbiddenException.class)
    public void test_setClientCredentials_getSynchronization_withInValidClientSecret() throws Throwable {
        apiClient = new ApiClientBuilder()
                .withBasePath(String.format("https://%s/services/metrics/v1", codeGenHost))
                .withTokenProviderHost(codeGenHost)
                .withPersonalAccessToken("unknown-token")
                .withDebugging(true).build();
        MeasurementsApi synchronizationsApi = new MeasurementsApi(apiClient);

        try {
            synchronizationsApi.getMeasurements("", WORKSPACE_ID);
        } catch (ApiException e) {
            Throwable cause = e.getCause();

            assertThat(((ForbiddenException) cause).getResponse().getStatus()).isEqualTo(403);
            throw cause;
        }
    }

}
