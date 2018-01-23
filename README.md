# Java SDK for LeanIX metrics REST API


## Overview
This SDK contains wrapper code used to call the REST API of the LeanIX metrics service from Java.
It allows to create new data points or fetch series from the metrics data store.

## Prerequisites ##

### API token
In order to use the code in this SDK, you need an API token to access the metrics service.
As a workspace administrator, you can generate a new API token by yourself in the LeanIX application Administration section.

The API token acts as credentials to access a LeanIX workspace as the user who generated the token. Hence you should take care to keep it private, for example by using a password safe application.

The LeanIX REST API uses OAuth2 access tokens to protect its resources. The SDK transparently uses the API token that is set in the ApiClient to obtain such an access token from the token provider. The host name of the token provider is normally "svc.leanix.net".

### Swagger documentation

You can find the LeanIX REST API documentation here [https://svc.leanix.net/services/metrics/v1/docs/](https://svc.leanix.net/services/metrics/v1/docs/).
The documentation is interactive - after entering an API token, you can try out every function directly from the documentation.


## How to use?
### Including the SDK in your project

Add a dependency to your maven project:

```XML
<dependencies>
  <dependency>
    <groupId>net.leanix</groupId>
    <artifactId>leanix-metrics-sdk-java</artifactId>
    <version>0.3.2-SNAPSHOT</version>
  </dependency>
</dependencies>
```

### Writing code
In order to use the SDK in your Java application, import the following packages:

```java
import net.leanix.dropkit.apiclient.*;
import net.leanix.metrics.api.*;
import net.leanix.metrics.api.models.*;
```

You need to instantiate a LeanIX API Client.
The builder class `ApiClientBuilder` helps you to build the ApiClient with proper configuration.

ApiClient contains a Jersey2 client that does the communication to the server.

An important property of the ApiClient is the URL to the REST API of the MTM service.
You also need to provide the API token and the hostname of the token provider here.

```java
ApiClient apiClient = new ApiClientBuilder()
    .withBasePath("https://svc.leanix.net/services/metrics/api/v1")
    .withTokenProviderHost("svc.leanix.net"))
    .withApiToken("NOnrUpMXEh87xbDCYkLfrBmfbzLOFznjqVqEbNMp")
    .build();

PointsApi pointsApi = new PointsApi(apiClient);
```

You can then use the API class to execute functions.

## Examples

We have created some simple examples to show you the main features of the SDK. See [example console project](samples/console).

### Create a new data point

See [CreatePoint.java](samples/console/src/main/java/CreatePoint.java)

```Java
Client client = new ApiClientBuilder()
                .withBasePath("https://svc.leanix.net/services/metrics/v1")
                .withTokenProviderHost("svc.leanix.net")
                .withPersonalAccessToken("my-personal-access-token")
                .build();
PointsApi pointsApi = new PointsApi(client);

// Create a point
Point p1 = new Point();
p1.setMeasurement("CPU");
p1.setWorkspaceId("12345");

// Add a field
Field f1 = new Field();
f1.setK("load");
f1.setV(1.5f);

// Add a tag
Tag t1 = new Tag();
t1.setK("environment");
t1.setV("prod");

p1.getTags().add(t1);
p1.getFields().add(f1);

try {
    pointsApi.createPoint(p1);
    System.out.println("Created point");
} catch (ApiException ex) {
    Logger.getLogger(CreatePoints.class.getName()).log(Level.SEVERE, "Unable to create point", ex);
}
```

### Show results of a series

See [ShowSeries.java](samples/console/src/main/java/ShowSeries.java).

The query language we use is an adaption of [influxDB's query language](https://docs.influxdata.com/influxdb/v0.13/query_language/)


```Java
Client client = new ApiClientBuilder()
                .withBasePath("https://svc.leanix.net/services/metrics/v1")
                .withTokenProviderHost("svc.leanix.net")
                .withPersonalAccessToken("my-personal-access-token");
SeriesApi seriesApi = new SeriesApi(client);

try {
    SeriesResponse response = seriesApi.getSeries("SELECT * FROM CPU", "12345");
    
    System.out.println("Showing data of measurement: " + response.getData().getName());
    
    int index = response.getData().getColumns().indexOf("load");
    
    for (Value v : response.getData().getValues()) {
        System.out.println(v.getT() + ": " + v.getV().get(index));
    }
    
} catch (ApiException ex) {
    Logger.getLogger(ShowSeries.class.getName()).log(Level.SEVERE, null, ex);
}
```

## Known Bugs, Issues and Todos

* Todo: Allow to submit date when creating a new point
* Todo: Support creation of more than one point at once (batch)

## Building the SDK

To rebuild the SDK, all relevant Swagger API metadata is pulled by default from host *svc.leanix.net*.
This metadata is used to build all Java API classes and models.
To specify another host in the pom.xml, use property *codegenHost*.

```bash
mvn clean package -Pcodegen
```

## Copyright and license
Copyright 2016 LeanIX GmbH under [the MIT license](LICENSE).
