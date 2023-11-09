package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repo {
    @JsonProperty("id")
    private long id;

    @JsonProperty("defaultBranch")
    private String defaultBranch;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ownerLogin")
    private String ownerLogin;

    @JsonProperty("currentUserCanPush")
    private boolean currentUserCanPush;

    @JsonProperty("isFork")
    private boolean isFork;

    @JsonProperty("isEmpty")
    private boolean isEmpty;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("ownerAvatar")
    private String ownerAvatar;

    @JsonProperty("public")
    private boolean isPublic;

    @JsonProperty("private")
    private boolean isPrivate;

    @JsonProperty("isOrgOwned")
    private boolean isOrgOwned;
}
