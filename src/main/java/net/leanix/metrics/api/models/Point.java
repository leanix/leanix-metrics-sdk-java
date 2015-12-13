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
import net.leanix.metrics.api.models.Field;
import net.leanix.metrics.api.models.Tag;
public class Point implements Serializable {
    /* A name for the measurement */
    private String measurement = null;
    /* A UUID string to relate the point to a workspace */
    private String workspaceId = null;
    /* List of tags */
    private List<Tag> tags = new ArrayList<Tag>();
    /* List of fields */
    private List<Field> fields = new ArrayList<Field>();
    @JsonProperty("measurement")
    public String getMeasurement() {
        return measurement;
    }

    @JsonProperty("measurement")
    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    @JsonProperty("workspaceId")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("workspaceId")
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Point {\n");
        sb.append("  measurement: ").append(measurement).append("\n");
        sb.append("  workspaceId: ").append(workspaceId).append("\n");
        sb.append("  tags: ").append(tags).append("\n");
        sb.append("  fields: ").append(fields).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}

