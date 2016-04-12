
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

import java.util.logging.Level;
import java.util.logging.Logger;

import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.metrics.api.SeriesApi;
import net.leanix.metrics.api.models.SeriesResponse;
import net.leanix.metrics.api.models.Value;

public class ShowSeries {

    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath("https://local-svc.leanix.net/services/metrics/v1");
        apiClient.setDebugging(true);

        // TODO rwe: set Personal Access Token here

        SeriesApi seriesApi = new SeriesApi(apiClient);

        try {
            SeriesResponse response = seriesApi
                    .getSeries("SELECT MAX(Series1) FROM availability WHERE time > '2016-01-01' GROUP BY time(1d)", "abc");

            System.out.println("Showing data of measurement: " + response.getData().getName());

            int index = response.getData().getFields().indexOf("max");

            for (Value v : response.getData().getValues()) {
                System.out.println(v.getT() + ": " + v.getV().get(index));
            }

        } catch (ApiException ex) {
            Logger.getLogger(ShowSeries.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
