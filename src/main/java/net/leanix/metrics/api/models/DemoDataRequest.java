package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class DemoDataRequest   {
  
  private String demoDataType = null;
  private String workspaceId = null;
  private String measurement = null;
  private String tagKey = null;
  private String tagValue = null;

  
  /**
   * The type of demo data series that has to be generate
   **/
  public DemoDataRequest demoDataType(String demoDataType) {
    this.demoDataType = demoDataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of demo data series that has to be generate")
  @JsonProperty("demoDataType")
  public String getDemoDataType() {
    return demoDataType;
  }
  public void setDemoDataType(String demoDataType) {
    this.demoDataType = demoDataType;
  }

  
  /**
   * A UUID string to relate the point to a workspace or \"shared\" if the shared database should be used.
   **/
  public DemoDataRequest workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A UUID string to relate the point to a workspace or \"shared\" if the shared database should be used.")
  @JsonProperty("workspaceId")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   * A name for the measurement
   **/
  public DemoDataRequest measurement(String measurement) {
    this.measurement = measurement;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A name for the measurement")
  @JsonProperty("measurement")
  public String getMeasurement() {
    return measurement;
  }
  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  
  /**
   * The value for the tag the demo data point is assigned to
   **/
  public DemoDataRequest tagKey(String tagKey) {
    this.tagKey = tagKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value for the tag the demo data point is assigned to")
  @JsonProperty("tagKey")
  public String getTagKey() {
    return tagKey;
  }
  public void setTagKey(String tagKey) {
    this.tagKey = tagKey;
  }

  
  /**
   * The name of the tag the demo data point is assigned to
   **/
  public DemoDataRequest tagValue(String tagValue) {
    this.tagValue = tagValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the tag the demo data point is assigned to")
  @JsonProperty("tagValue")
  public String getTagValue() {
    return tagValue;
  }
  public void setTagValue(String tagValue) {
    this.tagValue = tagValue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemoDataRequest demoDataRequest = (DemoDataRequest) o;
    return Objects.equals(this.demoDataType, demoDataRequest.demoDataType) &&
        Objects.equals(this.workspaceId, demoDataRequest.workspaceId) &&
        Objects.equals(this.measurement, demoDataRequest.measurement) &&
        Objects.equals(this.tagKey, demoDataRequest.tagKey) &&
        Objects.equals(this.tagValue, demoDataRequest.tagValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demoDataType, workspaceId, measurement, tagKey, tagValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemoDataRequest {\n");
    
    sb.append("    demoDataType: ").append(toIndentedString(demoDataType)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    tagKey: ").append(toIndentedString(tagKey)).append("\n");
    sb.append("    tagValue: ").append(toIndentedString(tagValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

