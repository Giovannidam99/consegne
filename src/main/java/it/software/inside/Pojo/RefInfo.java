package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefInfo {
    private String name;

    @JsonProperty("listCacheKey")
    private String listCacheKey;

    @JsonProperty("canEdit")
    private boolean canEdit;

    @JsonProperty("refType")
    private String refType;

    @JsonProperty("currentOid")
    private String currentOid;
}
