
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
    "user_id",
    "description",
    "scope",
    "status",
    "duration",
    "image",
    "lat",
    "lng",
    "location",
    "share_facebook",
    "share_twitter",
    "comments_count",
    "likes_count",
    "shares_count",
    "frame_id",
    "created_at",
    "updated_at",
    "published_at",
    "deleted_at",
    "highlighted",
    "views_count",
    "share_path",
    "share_wechat_count",
    "share_path_count",
    "share_facebook_count",
    "share_twitter_count",
    "reports_count",
    "url",
    "url_ssl",
    "image_cdn",
    "image_cdn_ssl",
    "is_liked",
    "is_friend",
    "is_user",
    "video",
    "audio",
    "user"
})

public class Datum {

    @JsonProperty("id")
    private String id;
    @JsonProperty("user_id")
    private String userId;
    @JsonProperty("description")
    private String description;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("status")
    private String status;
    @JsonProperty("duration")
    private String duration;
    @JsonProperty("image")
    private String image;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lng")
    private String lng;
    @JsonProperty("location")
    private String location;
    @JsonProperty("share_facebook")
    private String shareFacebook;
    @JsonProperty("share_twitter")
    private String shareTwitter;
    @JsonProperty("comments_count")
    private String commentsCount;
    @JsonProperty("likes_count")
    private String likesCount;
    @JsonProperty("shares_count")
    private String sharesCount;
    @JsonProperty("frame_id")
    private String frameId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("deleted_at")
    private Object deletedAt;
    @JsonProperty("highlighted")
    private String highlighted;
    @JsonProperty("views_count")
    private String viewsCount;
    @JsonProperty("share_path")
    private String sharePath;
    @JsonProperty("share_wechat_count")
    private String shareWechatCount;
    @JsonProperty("share_path_count")
    private String sharePathCount;
    @JsonProperty("share_facebook_count")
    private String shareFacebookCount;
    @JsonProperty("share_twitter_count")
    private String shareTwitterCount;
    @JsonProperty("reports_count")
    private String reportsCount;
    @JsonProperty("url")
    private String url;
    @JsonProperty("url_ssl")
    private String urlSsl;
    @JsonProperty("image_cdn")
    private String imageCdn;
    @JsonProperty("image_cdn_ssl")
    private String imageCdnSsl;
    @JsonProperty("is_liked")
    private Boolean isLiked;
    @JsonProperty("is_friend")
    private Boolean isFriend;
    @JsonProperty("is_user")
    private Boolean isUser;
    @JsonProperty("video")
    private Video video;
    @JsonProperty("audio")
    private Audio audio;
    @JsonProperty("user")
    private User user;
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

    @JsonProperty("user_id")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("duration")
    public String getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(String duration) {
        this.duration = duration;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public String getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(String lng) {
        this.lng = lng;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("share_facebook")
    public String getShareFacebook() {
        return shareFacebook;
    }

    @JsonProperty("share_facebook")
    public void setShareFacebook(String shareFacebook) {
        this.shareFacebook = shareFacebook;
    }

    @JsonProperty("share_twitter")
    public String getShareTwitter() {
        return shareTwitter;
    }

    @JsonProperty("share_twitter")
    public void setShareTwitter(String shareTwitter) {
        this.shareTwitter = shareTwitter;
    }

    @JsonProperty("comments_count")
    public String getCommentsCount() {
        return commentsCount;
    }

    @JsonProperty("comments_count")
    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    @JsonProperty("likes_count")
    public String getLikesCount() {
        return likesCount;
    }

    @JsonProperty("likes_count")
    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    @JsonProperty("shares_count")
    public String getSharesCount() {
        return sharesCount;
    }

    @JsonProperty("shares_count")
    public void setSharesCount(String sharesCount) {
        this.sharesCount = sharesCount;
    }

    @JsonProperty("frame_id")
    public String getFrameId() {
        return frameId;
    }

    @JsonProperty("frame_id")
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    @JsonProperty("deleted_at")
    public Object getDeletedAt() {
        return deletedAt;
    }

    @JsonProperty("deleted_at")
    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    @JsonProperty("highlighted")
    public String getHighlighted() {
        return highlighted;
    }

    @JsonProperty("highlighted")
    public void setHighlighted(String highlighted) {
        this.highlighted = highlighted;
    }

    @JsonProperty("views_count")
    public String getViewsCount() {
        return viewsCount;
    }

    @JsonProperty("views_count")
    public void setViewsCount(String viewsCount) {
        this.viewsCount = viewsCount;
    }

    @JsonProperty("share_path")
    public String getSharePath() {
        return sharePath;
    }

    @JsonProperty("share_path")
    public void setSharePath(String sharePath) {
        this.sharePath = sharePath;
    }

    @JsonProperty("share_wechat_count")
    public String getShareWechatCount() {
        return shareWechatCount;
    }

    @JsonProperty("share_wechat_count")
    public void setShareWechatCount(String shareWechatCount) {
        this.shareWechatCount = shareWechatCount;
    }

    @JsonProperty("share_path_count")
    public String getSharePathCount() {
        return sharePathCount;
    }

    @JsonProperty("share_path_count")
    public void setSharePathCount(String sharePathCount) {
        this.sharePathCount = sharePathCount;
    }

    @JsonProperty("share_facebook_count")
    public String getShareFacebookCount() {
        return shareFacebookCount;
    }

    @JsonProperty("share_facebook_count")
    public void setShareFacebookCount(String shareFacebookCount) {
        this.shareFacebookCount = shareFacebookCount;
    }

    @JsonProperty("share_twitter_count")
    public String getShareTwitterCount() {
        return shareTwitterCount;
    }

    @JsonProperty("share_twitter_count")
    public void setShareTwitterCount(String shareTwitterCount) {
        this.shareTwitterCount = shareTwitterCount;
    }

    @JsonProperty("reports_count")
    public String getReportsCount() {
        return reportsCount;
    }

    @JsonProperty("reports_count")
    public void setReportsCount(String reportsCount) {
        this.reportsCount = reportsCount;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("url_ssl")
    public String getUrlSsl() {
        return urlSsl;
    }

    @JsonProperty("url_ssl")
    public void setUrlSsl(String urlSsl) {
        this.urlSsl = urlSsl;
    }

    @JsonProperty("image_cdn")
    public String getImageCdn() {
        return imageCdn;
    }

    @JsonProperty("image_cdn")
    public void setImageCdn(String imageCdn) {
        this.imageCdn = imageCdn;
    }

    @JsonProperty("image_cdn_ssl")
    public String getImageCdnSsl() {
        return imageCdnSsl;
    }

    @JsonProperty("image_cdn_ssl")
    public void setImageCdnSsl(String imageCdnSsl) {
        this.imageCdnSsl = imageCdnSsl;
    }

    @JsonProperty("is_liked")
    public Boolean getIsLiked() {
        return isLiked;
    }

    @JsonProperty("is_liked")
    public void setIsLiked(Boolean isLiked) {
        this.isLiked = isLiked;
    }

    @JsonProperty("is_friend")
    public Boolean getIsFriend() {
        return isFriend;
    }

    @JsonProperty("is_friend")
    public void setIsFriend(Boolean isFriend) {
        this.isFriend = isFriend;
    }

    @JsonProperty("is_user")
    public Boolean getIsUser() {
        return isUser;
    }

    @JsonProperty("is_user")
    public void setIsUser(Boolean isUser) {
        this.isUser = isUser;
    }

    @JsonProperty("video")
    public Video getVideo() {
        return video;
    }

    @JsonProperty("video")
    public void setVideo(Video video) {
        this.video = video;
    }

    @JsonProperty("audio")
    public Object getAudio() {
        return audio;
    }

    @JsonProperty("audio")
    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
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
