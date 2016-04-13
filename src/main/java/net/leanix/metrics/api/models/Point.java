package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.leanix.metrics.api.models.Field;
import net.leanix.metrics.api.models.Tag;






public class Point   {
  
  private String measurement = null;
  private String workspaceId = null;
  private Date time = null;
  private List<Tag> tags = new ArrayList<Tag>();
  private List<Field> fields = new ArrayList<Field>();

  
  /**
   * A name for the measurement
   **/
  public Point measurement(String measurement) {
    this.measurement = measurement;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A name for the measurement")
  @JsonProperty("measurement")
  public String getMeasurement() {
    return measurement;
  }
  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  
  /**
   * A UUID string to relate the point to a workspace or \"shared\" if the shared database should be used.
   **/
  public Point workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A UUID string to relate the point to a workspace or \"shared\" if the shared database should be used.")
  @JsonProperty("workspaceId")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   **/
  public Point time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }

  
  /**
   * List of tags
   **/
  public Point tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of tags")
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  
  /**
   * List of fields
   **/
  public Point fields(List<Field> fields) {
    this.fields = fields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of fields")
  @JsonProperty("fields")
  public List<Field> getFields() {
    return fields;
  }
  public void setFields(List<Field> fields) {
    this.fields = fields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Point point = (Point) o;
    return Objects.equals(this.measurement, point.measurement) &&
        Objects.equals(this.workspaceId, point.workspaceId) &&
        Objects.equals(this.time, point.time) &&
        Objects.equals(this.tags, point.tags) &&
        Objects.equals(this.fields, point.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurement, workspaceId, time, tags, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Point {\n");
    
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

