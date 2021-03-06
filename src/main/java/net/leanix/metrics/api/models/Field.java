/*
 * LeanIX Metrics REST API
 * Stores and retrieves metrics
 *
 * OpenAPI spec version: 0.3.3-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.metrics.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Field
 */

public class Field {
  @JsonProperty("k")
  private String k = null;

  @JsonProperty("v")
  private Double v = null;

  @JsonProperty("s")
  private String s = null;

  public Field k(String k) {
    this.k = k;
    return this;
  }

   /**
   * Field key
   * @return k
  **/
  @ApiModelProperty(value = "Field key")
  public String getK() {
    return k;
  }

  public void setK(String k) {
    this.k = k;
  }

  public Field v(Double v) {
    this.v = v;
    return this;
  }

   /**
   * Field value (floating point number). Don&#39;t use together with character string value!
   * @return v
  **/
  @ApiModelProperty(value = "Field value (floating point number). Don't use together with character string value!")
  public Double getV() {
    return v;
  }

  public void setV(Double v) {
    this.v = v;
  }

  public Field s(String s) {
    this.s = s;
    return this;
  }

   /**
   * Field value (character string). Don&#39;t use together with floating point number value!
   * @return s
  **/
  @ApiModelProperty(value = "Field value (character string). Don't use together with floating point number value!")
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

