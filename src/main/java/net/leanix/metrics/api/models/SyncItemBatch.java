package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.metrics.api.models.SyncItem;






public class SyncItemBatch   {
  
  private List<SyncItem> syncItems = new ArrayList<SyncItem>();
  private String progress = null;

  
  /**
   **/
  public SyncItemBatch syncItems(List<SyncItem> syncItems) {
    this.syncItems = syncItems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("syncItems")
  public List<SyncItem> getSyncItems() {
    return syncItems;
  }
  public void setSyncItems(List<SyncItem> syncItems) {
    this.syncItems = syncItems;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("progress")
  public String getProgress() {
    return progress;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyncItemBatch syncItemBatch = (SyncItemBatch) o;
    return Objects.equals(this.syncItems, syncItemBatch.syncItems) &&
        Objects.equals(this.progress, syncItemBatch.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncItems, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncItemBatch {\n");
    
    sb.append("    syncItems: ").append(toIndentedString(syncItems)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

