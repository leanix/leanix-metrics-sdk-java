/*
* The MIT License (MIT)	 
*
* Copyright (c) 2015 LeanIX GmbH
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of
* this software and associated documentation files (the "Software"), to deal in
* the Software without restriction, including without limitation the rights to
* use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
* the Software, and to permit persons to whom the Software is furnished to do so,
* subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
* FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
* COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
* IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
* CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package net.leanix.metrics.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Set;

import java.util.*;
import net.leanix.metrics.api.models.Measurement;
import net.leanix.metrics.api.models.ApiError;
public class MeasurementListResponse implements Serializable {
    private List<Measurement> data = new ArrayList<Measurement>();
    private List<ApiError> errors = new ArrayList<ApiError>();
    private String status = null;
    private String message = null;
    private String type = null;
    private Long total = null;
    @JsonProperty("data")
    public List<Measurement> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Measurement> data) {
        this.data = data;
    }

    @JsonProperty("errors")
    public List<ApiError> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<ApiError> errors) {
        this.errors = errors;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeasurementListResponse {\n");
        sb.append("  data: ").append(data).append("\n");
        sb.append("  errors: ").append(errors).append("\n");
        sb.append("  status: ").append(status).append("\n");
        sb.append("  message: ").append(message).append("\n");
        sb.append("  type: ").append(type).append("\n");
        sb.append("  total: ").append(total).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}

