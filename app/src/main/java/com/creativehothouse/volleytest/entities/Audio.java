package com.creativehothouse.volleytest.entities;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)

@JsonPropertyOrder({
        "artistName",
        "collectionName",
        "copyRight",
        "created_at",
        "id",
        "trackName",
        "updated_at"
})


public class Audio {
    @JsonProperty("artistName")
    private String artistName;
    @JsonProperty("collectionName")
    private String collectionName;
    @JsonProperty("copyRight")
    private String copyRight;
    @JsonProperty("created_at")
    private String created_at;
    @JsonProperty("id")
    private int id;
    @JsonProperty("trackName")
    private String trackName;
    @JsonProperty("updated_at")
    private String updated_at;

    @JsonProperty("artistName")
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @JsonProperty("artistName")
    public String getArtistName() {
        return artistName;
    }

    @JsonProperty("collectionName")
    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    @JsonProperty("collectionName")
    public String getCollectionName() {
        return collectionName;
    }

    @JsonProperty("copyRight")
    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }

    @JsonProperty("copyRight")
    public String getCopyRight() {
        return copyRight;
    }

    @JsonProperty("created_at")
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @JsonProperty("created_at")
    public String getCreated_at() {
        return created_at;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("trackName")
    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    @JsonProperty("trackName")
    public String getTrackName() {
        return trackName;
    }

    @JsonProperty("updated_at")
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    @JsonProperty("updated_at")
    public String getUpdated_at() {
        return updated_at;
    }
}
