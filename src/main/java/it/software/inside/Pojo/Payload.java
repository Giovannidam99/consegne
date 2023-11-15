package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

import it.software.inside.Pojo.FileTree;
import lombok.Data;
@Data
public  class Payload {
    @JsonProperty("allShortcutsEnabled")
    private boolean allShortcutsEnabled;
    @JsonProperty("fileTree")
    private FileTree fileTree;
    @JsonProperty("fileTreeProcessingTime")
    private double fileTreeProcessingTime;
    @JsonProperty("foldersToFetch")
    private List<String> foldersToFetch;
    @JsonProperty("reducedMotionEnabled")
    private Boolean reducedMotionEnabled;
    @JsonProperty("repo")
    private Repo repo;
    @JsonProperty("symbolsExpanded")
    private boolean symbolsExpanded;
    @JsonProperty("treeExpanded")
    private boolean treeExpanded;
    @JsonProperty("refInfo")
    private RefInfo refInfo;
    @JsonProperty("path")
    private String path;
    @JsonProperty("currentUser")
    private Object currentUser;

    @JsonProperty("blob")
    private java.sql.Blob blob;

    @JsonProperty("copilotInfo")
    private Object copilotInfo;
    @JsonProperty("copilotAccessAllowed")
    private boolean copilotAccessAllowed;
    @JsonProperty("csrf_tokens")
    private CsrfTokens csrfTokens;
}