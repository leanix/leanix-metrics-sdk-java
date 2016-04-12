package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class Tag   {
  
  private String k = null;
  private String v = null;

  
  /**
   * Tag key
   **/
  public Tag k(String k) {
    this.k = k;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tag key")
  @JsonProperty("k")
  public String getK() {
    return k;
  }
  public void setK(String k) {
    this.k = k;
  }

  
  /**
   * Tag value
   **/
  public Tag v(String v) {
    this.v = v;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Tag value")
  @JsonProperty("v")
  public String getV() {
    return v;
  }
  public void setV(String v) {
    this.v = v;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.k, tag.k) &&
        Objects.equals(this.v, tag.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k, v);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
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

