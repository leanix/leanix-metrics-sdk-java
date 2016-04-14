
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

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.ApiClientBuilder;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.metrics.api.PointsApi;
import net.leanix.metrics.api.models.Field;
import net.leanix.metrics.api.models.Point;
import net.leanix.metrics.api.models.Tag;

public class CreatePoints {

    public static void main(String[] args) {
        String host = args[0];
        String pas = args[1];
        final String workspaceId = args[2];
        ApiClient apiClient = new ApiClientBuilder()
                .withBasePath(String.format("https://%s/services/metrics/v1", host))
                .withTokenProviderHost(host)
                .withPersonalAccessToken(pas)
                // .withDebugging(true)
                .build();

        final PointsApi pointsApi = new PointsApi(apiClient);

        Runnable helloRunnable = new Runnable() {
            public void run() {

                OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);

                // Create a point
                Point p1 = new Point();
                p1.setMeasurement("CPU");
                p1.setWorkspaceId(workspaceId);

                // Add a field
                Field f1 = new Field();
                f1.setK("load");
                f1.setV(osBean.getSystemLoadAverage());

                // Add a tag
                Tag t1 = new Tag();
                t1.setK("factSheetId");
                t1.setV("100000002");

                p1.getTags().add(t1);
                p1.getFields().add(f1);

                try {
                    pointsApi.createPoint(p1);
                    System.out.println("Created point");
                } catch (ApiException ex) {
                    Logger.getLogger(CreatePoints.class.getName()).log(Level.SEVERE, "Unable to create point", ex);
                }
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(helloRunnable, 0, 2, TimeUnit.SECONDS);
    }
}
