package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;






public class Synchronization   {
  
  private String id = null;
  private Date createdAt = null;
  private Date finishedAt = null;
  private String workspaceId = null;
  private String workspaceName = null;
  private String targetWorkspaceId = null;
  private String targetWorkspaceName = null;
  private String userId = null;
  private String topic = null;
  private String scope = null;
  private String direction = null;
  private String status = null;
  private String progress = null;
  private Integer totalCount = null;
  private Integer processedCount = null;
  private Integer errorCount = null;
  private Integer actionCount = null;
  private String message = null;

  
  /**
   **/
  public Synchronization id(String id) {
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
  public Synchronization createdAt(Date createdAt) {
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
  public Synchronization finishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("finishedAt")
  public Date getFinishedAt() {
    return finishedAt;
  }
  public void setFinishedAt(Date finishedAt) {
    this.finishedAt = finishedAt;
  }

  
  /**
   **/
  public Synchronization workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspaceId")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   **/
  public Synchronization workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  
  /**
   **/
  public Synchronization targetWorkspaceId(String targetWorkspaceId) {
    this.targetWorkspaceId = targetWorkspaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetWorkspaceId")
  public String getTargetWorkspaceId() {
    return targetWorkspaceId;
  }
  public void setTargetWorkspaceId(String targetWorkspaceId) {
    this.targetWorkspaceId = targetWorkspaceId;
  }

  
  /**
   **/
  public Synchronization targetWorkspaceName(String targetWorkspaceName) {
    this.targetWorkspaceName = targetWorkspaceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("targetWorkspaceName")
  public String getTargetWorkspaceName() {
    return targetWorkspaceName;
  }
  public void setTargetWorkspaceName(String targetWorkspaceName) {
    this.targetWorkspaceName = targetWorkspaceName;
  }

  
  /**
   **/
  public Synchronization userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public Synchronization topic(String topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  
  /**
   **/
  public Synchronization scope(String scope) {
    this.scope = scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }

  
  /**
   **/
  public Synchronization direction(String direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("direction")
  public String getDirection() {
    return direction;
  }
  public void setDirection(String direction) {
    this.direction = direction;
  }

  
  /**
   **/
  public Synchronization status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public Synchronization progress(String progress) {
    this.progress = progress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("progress")
  public String getProgress() {
    return progress;
  }
  public void setProgress(String progress) {
    this.progress = progress;
  }

  
  /**
   **/
  public Synchronization totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalCount")
  public Integer getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  
  /**
   **/
  public Synchronization processedCount(Integer processedCount) {
    this.processedCount = processedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processedCount")
  public Integer getProcessedCount() {
    return processedCount;
  }
  public void setProcessedCount(Integer processedCount) {
    this.processedCount = processedCount;
  }

  
  /**
   **/
  public Synchronization errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  
  /**
   **/
  public Synchronization actionCount(Integer actionCount) {
    this.actionCount = actionCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionCount")
  public Integer getActionCount() {
    return actionCount;
  }
  public void setActionCount(Integer actionCount) {
    this.actionCount = actionCount;
  }

  
  /**
   **/
  public Synchronization message(String message) {
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
    Synchronization synchronization = (Synchronization) o;
    return Objects.equals(this.id, synchronization.id) &&
        Objects.equals(this.createdAt, synchronization.createdAt) &&
        Objects.equals(this.finishedAt, synchronization.finishedAt) &&
        Objects.equals(this.workspaceId, synchronization.workspaceId) &&
        Objects.equals(this.workspaceName, synchronization.workspaceName) &&
        Objects.equals(this.targetWorkspaceId, synchronization.targetWorkspaceId) &&
        Objects.equals(this.targetWorkspaceName, synchronization.targetWorkspaceName) &&
        Objects.equals(this.userId, synchronization.userId) &&
        Objects.equals(this.topic, synchronization.topic) &&
        Objects.equals(this.scope, synchronization.scope) &&
        Objects.equals(this.direction, synchronization.direction) &&
        Objects.equals(this.status, synchronization.status) &&
        Objects.equals(this.progress, synchronization.progress) &&
        Objects.equals(this.totalCount, synchronization.totalCount) &&
        Objects.equals(this.processedCount, synchronization.processedCount) &&
        Objects.equals(this.errorCount, synchronization.errorCount) &&
        Objects.equals(this.actionCount, synchronization.actionCount) &&
        Objects.equals(this.message, synchronization.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, finishedAt, workspaceId, workspaceName, targetWorkspaceId, targetWorkspaceName, userId, topic, scope, direction, status, progress, totalCount, processedCount, errorCount, actionCount, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Synchronization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    targetWorkspaceId: ").append(toIndentedString(targetWorkspaceId)).append("\n");
    sb.append("    targetWorkspaceName: ").append(toIndentedString(targetWorkspaceName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    processedCount: ").append(toIndentedString(processedCount)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    actionCount: ").append(toIndentedString(actionCount)).append("\n");
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

