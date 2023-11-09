package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CsrfToken {
    @JsonProperty("post")
    private String post;
}
