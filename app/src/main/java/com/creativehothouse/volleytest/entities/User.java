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
        "remember_token",
        "birthday",
        "views_count",
        "app_version",
        "avatar",
        "lang",
        "last_active",
        "num_clipsters",
        "country",
        "id",
        "updated_at",
        "token",
        "email",
        "admin",
        "name",
        "created_at",
        "gender",
        "slug"
})
public class User {

    @JsonProperty("remember_token")
    private String rememberToken;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("views_count")
    private String viewsCount;
    @JsonProperty("app_version")
    private String appVersion;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("last_active")
    private String lastActive;
    @JsonProperty("num_clipsters")
    private String numClipsters;
    @JsonProperty("country")
    private String country;
    @JsonProperty("id")
    private String id;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("token")
    private String token;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("admin")
    private String admin;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("slug")
    private String slug;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("remember_token")
    public String getRememberToken() {
        return rememberToken;
    }

    @JsonProperty("remember_token")
    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    @JsonProperty("birthday")
    public String getBirthday() {
        return birthday;
    }

    @JsonProperty("birthday")
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @JsonProperty("views_count")
    public String getViewsCount() {
        return viewsCount;
    }

    @JsonProperty("views_count")
    public void setViewsCount(String viewsCount) {
        this.viewsCount = viewsCount;
    }

    @JsonProperty("app_version")
    public String getAppVersion() {
        return appVersion;
    }

    @JsonProperty("app_version")
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("last_active")
    public String getLastActive() {
        return lastActive;
    }

    @JsonProperty("last_active")
    public void setLastActive(String lastActive) {
        this.lastActive = lastActive;
    }

    @JsonProperty("num_clipsters")
    public String getNumClipsters() {
        return numClipsters;
    }

    @JsonProperty("num_clipsters")
    public void setNumClipsters(String numClipsters) {
        this.numClipsters = numClipsters;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    @JsonProperty("admin")
    public String getAdmin() {
        return admin;
    }

    @JsonProperty("admin")
    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
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
