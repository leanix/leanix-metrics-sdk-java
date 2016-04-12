package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class Field   {
  
  private String k = null;
  private Double v = null;
  private String s = null;

  
  /**
   * Field key
   **/
  public Field k(String k) {
    this.k = k;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field key")
  @JsonProperty("k")
  public String getK() {
    return k;
  }
  public void setK(String k) {
    this.k = k;
  }

  
  /**
   * Field value (floating point number). Don't use together with character string value!
   **/
  public Field v(Double v) {
    this.v = v;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field value (floating point number). Don't use together with character string value!")
  @JsonProperty("v")
  public Double getV() {
    return v;
  }
  public void setV(Double v) {
    this.v = v;
  }

  
  /**
   * Field value (character string). Don't use together with floating point number value!
   **/
  public Field s(String s) {
    this.s = s;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field value (character string). Don't use together with floating point number value!")
  @JsonProperty("s")
  public String getS() {
    return s;
  }
  public void setS(String s) {
    this.s = s;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.k, field.k) &&
        Objects.equals(this.v, field.v) &&
        Objects.equals(this.s, field.s);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k, v, s);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
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

