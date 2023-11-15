package it.software.inside.controller;

import it.software.inside.pojo.GitHubRepoInfo;
import it.software.inside.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import it.software.inside.configuration.AppConfiguration;
import java.io.IOException;
import it.software.inside.pojo.Payload;
import java.util.List;

@RestController
public class ControllerCovid {
    @Autowired
    CovidService covidService;
    @Autowired
    AppConfiguration appConfiguration;

    @GetMapping
    public ResponseEntity<Payload> getCovidData() {
        return covidService.covidRestTemplate();
        public Object getCovidData()  {
            return covidService.covidDataConverter();

        }
    }
}