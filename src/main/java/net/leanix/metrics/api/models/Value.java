package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;






public class Value   {
  
  private Date t = null;
  private List<Object> v = new ArrayList<Object>();

  
  /**
   **/
  public Value t(Date t) {
    this.t = t;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("t")
  public Date getT() {
    return t;
  }
  public void setT(Date t) {
    this.t = t;
  }

  
  /**
   **/
  public Value v(List<Object> v) {
    this.v = v;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("v")
  public List<Object> getV() {
    return v;
  }
  public void setV(List<Object> v) {
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
    Value value = (Value) o;
    return Objects.equals(this.t, value.t) &&
        Objects.equals(this.v, value.v);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t, v);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
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

