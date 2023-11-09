package it.software.inside.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.software.inside.Pojo.CsrfToken;

public class CsrfTokens {


    @JsonProperty("/pcm-dpc/COVID-19/branches")
    private CsrfToken branchesCsrfToken;

    @JsonProperty("/repos/preferences")
    private CsrfToken reposPreferencesCsrfToken;
}
