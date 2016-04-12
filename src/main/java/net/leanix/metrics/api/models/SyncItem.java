package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;






public class SyncItem   {
  
  private String id = null;
  private Date createdAt = null;
  private String status = null;
  private String action = null;
  private String sourceId = null;
  private String sourceName = null;
  private String sourceType = null;
  private String targetId = null;
  private String targetName = null;
  private String targetType = null;
  private String message = null;

  
  /**
   **/
  public SyncItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public SyncItem createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  
  /**
   **/
  public SyncItem status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public SyncItem action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   **/
  public SyncItem sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  
  /**
   **/
  public SyncItem sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceName")
  public String getSourceName() {
    return sourceName;
  }
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  
  /**
   **/
  public SyncItem sourceType(String sourceType) {
    this.sourceType = sourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sourceType")
  public String getSourceType() {
    return sourceType;
  }
  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  
  /**
   **/
  public SyncItem targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetId")
  public String getTargetId() {
    return targetId;
  }
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  
  /**
   **/
  public SyncItem targetName(String targetName) {
    this.targetName = targetName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetName")
  public String getTargetName() {
    return targetName;
  }
  public void setTargetName(String targetName) {
    this.targetName = targetName;
  }

  
  /**
   **/
  public SyncItem targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetType")
  public String getTargetType() {
    return targetType;
  }
  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  
  /**
   **/
  public SyncItem message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncItem syncItem = (SyncItem) o;
    return Objects.equals(this.id, syncItem.id) &&
        Objects.equals(this.createdAt, syncItem.createdAt) &&
        Objects.equals(this.status, syncItem.status) &&
        Objects.equals(this.action, syncItem.action) &&
        Objects.equals(this.sourceId, syncItem.sourceId) &&
        Objects.equals(this.sourceName, syncItem.sourceName) &&
        Objects.equals(this.sourceType, syncItem.sourceType) &&
        Objects.equals(this.targetId, syncItem.targetId) &&
        Objects.equals(this.targetName, syncItem.targetName) &&
        Objects.equals(this.targetType, syncItem.targetType) &&
        Objects.equals(this.message, syncItem.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, status, action, sourceId, sourceName, sourceType, targetId, targetName, targetType, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

