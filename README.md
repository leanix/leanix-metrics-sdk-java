# Java SDK for leanIX Metrics REST API (BETA)

Remark: This SDK is still in early beta version, most likely there will be changes to the API. Use at your own risk. Also see below for known bugs or issues.

Java client for metrics, allows to create new data points or fetch series from the metrics data store.

## How to use?

Add a dependency to your maven project:

```XML
<dependencies>
  <dependency>
    <groupId>net.leanix</groupId>
    <artifactId>leanix-metrics-sdk-java</artifactId>
    <version>0.1.0</version>
  </dependency>
</dependencies>
```

Initialize an API client:

```Java
Client client = ClientFactory.create("https://local-svc.leanix.net/services/metrics/v1");
PointsApi pointsApi = new PointsApi(client);
```

## Examples

We have created some simple examples to show you the main features of the SDK. See [example console project](samples/console).

### Create a new data point

See [CreatePoint.java](samples/console/src/main/java/CreatePoint.java)

```Java
Client client = ClientFactory.create("https://local-svc.leanix.net/services/metrics/v1");
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

See [ShowSeries.java](samples/console/src/main/java/ShowSeries.java)

```Java
Client client = ClientFactory.create("https://local-svc.leanix.net/services/metrics/v1");
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

* Todo: Metics currently does not have authentication activated - in future access will be possible using oAuth Access Tokens.
* Todo: Allow to submit date when creating a new point
* Todo: Support creation of more than one point at once (batch)
