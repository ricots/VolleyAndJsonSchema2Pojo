
package com.creativehothouse.volleytest.entities;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.HashMap;
import java.util.Map;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)

@JsonPropertyOrder({
    "id",
    "clipster_id",
    "duration",
    "size",
    "video_codec",
    "audio_codec",
    "width",
    "height",
    "frames",
    "files",
    "hash",
    "file_name",
    "file",
    "file_ssl",
    "short_url",
    "short_url_ssl",
    "streaming"
})
public class Video {

    @JsonProperty("id")
    private String id;
    @JsonProperty("clipster_id")
    private String clipsterId;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("size")
    private String size;
    @JsonProperty("video_codec")
    private String videoCodec;
    @JsonProperty("audio_codec")
    private String audioCodec;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("frames")
    private String frames;
    @JsonProperty("files")
    private String files;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("file")
    private String file;
    @JsonProperty("file_ssl")
    private String fileSsl;
    @JsonProperty("short_url")
    private String shortUrl;
    @JsonProperty("short_url_ssl")
    private String shortUrlSsl;
    @JsonProperty("streaming")
    private String streaming;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("clipster_id")
    public String getClipsterId() {
        return clipsterId;
    }

    @JsonProperty("clipster_id")
    public void setClipsterId(String clipsterId) {
        this.clipsterId = clipsterId;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("video_codec")
    public String getVideoCodec() {
        return videoCodec;
    }

    @JsonProperty("video_codec")
    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    @JsonProperty("audio_codec")
    public String getAudioCodec() {
        return audioCodec;
    }

    @JsonProperty("audio_codec")
    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("frames")
    public String getFrames() {
        return frames;
    }

    @JsonProperty("frames")
    public void setFrames(String frames) {
        this.frames = frames;
    }

    @JsonProperty("files")
    public String getFiles() {
        return files;
    }

    @JsonProperty("files")
    public void setFiles(String files) {
        this.files = files;
    }

    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    @JsonProperty("file_name")
    public String getFileName() {
        return fileName;
    }

    @JsonProperty("file_name")
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @JsonProperty("file")
    public String getFile() {
        return file;
    }

    @JsonProperty("file")
    public void setFile(String file) {
        this.file = file;
    }

    @JsonProperty("file_ssl")
    public String getFileSsl() {
        return fileSsl;
    }

    @JsonProperty("file_ssl")
    public void setFileSsl(String fileSsl) {
        this.fileSsl = fileSsl;
    }

    @JsonProperty("short_url")
    public String getShortUrl() {
        return shortUrl;
    }

    @JsonProperty("short_url")
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @JsonProperty("short_url_ssl")
    public String getShortUrlSsl() {
        return shortUrlSsl;
    }

    @JsonProperty("short_url_ssl")
    public void setShortUrlSsl(String shortUrlSsl) {
        this.shortUrlSsl = shortUrlSsl;
    }

    @JsonProperty("streaming")
    public String getStreaming() {
        return streaming;
    }

    @JsonProperty("streaming")
    public void setStreaming(String streaming) {
        this.streaming = streaming;
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
