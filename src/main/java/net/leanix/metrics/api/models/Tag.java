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

public class Tag implements Serializable {
    /* Tag value */
    private String v = null;
    /* Tag key */
    private String k = null;
    @JsonProperty("v")
    public String getV() {
        return v;
    }

    @JsonProperty("v")
    public void setV(String v) {
        this.v = v;
    }

    @JsonProperty("k")
    public String getK() {
        return k;
    }

    @JsonProperty("k")
    public void setK(String k) {
        this.k = k;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tag {\n");
        sb.append("  v: ").append(v).append("\n");
        sb.append("  k: ").append(k).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}

