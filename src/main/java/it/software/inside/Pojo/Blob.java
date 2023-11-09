package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Blob {
    private List<List<String>> csv;

    @JsonProperty("csvError")
    private Object csvError;

    private DependabotInfo dependabotInfo;

    @JsonProperty("displayName")
    private String displayName;

    @JsonProperty("displayUrl")
    private String displayUrl;
}
