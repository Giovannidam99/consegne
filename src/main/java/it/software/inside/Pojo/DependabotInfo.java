package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DependabotInfo {
    @JsonProperty("showConfigurationBanner")
    private boolean showConfigurationBanner;

    @JsonProperty("configFilePath")
    private Object configFilePath;

    @JsonProperty("networkDependabotPath")
    private String networkDependabotPath;

    @JsonProperty("dismissConfigurationNoticePath")
    private String dismissConfigurationNoticePath;

    @JsonProperty("configurationNoticeDismissed")
    private Object configurationNoticeDismissed;
}
