package it.software.inside.Covid.Controller;

import it.software.inside.Service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class ControllerCovid {

    private final CovidService covidservice;

    @Autowired
    public ControllerCovid(CovidService covidservice) {
        this.covidservice = covidservice;
    }

    @GetMapping("/")
    @ResponseBody
    public List<Object> getCovid() {
        return covidservice.getCovid();
    }
}