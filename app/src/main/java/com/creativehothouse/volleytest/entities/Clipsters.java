
package com.creativehothouse.volleytest.entities;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "total",
    "per_page",
    "current_page",
    "last_page",
    "from",
    "to",
    "data"
})
public class Clipsters {

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("current_page")
    private Integer currentPage;
    @JsonProperty("last_page")
    private Integer lastPage;
    @JsonProperty("from")
    private Integer from;
    @JsonProperty("to")
    private Integer to;
    @JsonProperty("data")
    private List<Datum> data = new ArrayList<Datum>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("per_page")
    public Integer getPerPage() {
        return perPage;
    }

    @JsonProperty("per_page")
    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @JsonProperty("current_page")
    public Integer getCurrentPage() {
        return currentPage;
    }

    @JsonProperty("current_page")
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @JsonProperty("last_page")
    public Integer getLastPage() {
        return lastPage;
    }

    @JsonProperty("last_page")
    public void setLastPage(Integer lastPage) {
        this.lastPage = lastPage;
    }

    @JsonProperty("from")
    public Integer getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(Integer from) {
        this.from = from;
    }

    @JsonProperty("to")
    public Integer getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(Integer to) {
        this.to = to;
    }

    @JsonProperty("data")
    public List<Datum> getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(List<Datum> data) {
        this.data = data;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
