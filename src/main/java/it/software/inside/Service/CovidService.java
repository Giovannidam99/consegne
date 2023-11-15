package it.software.inside.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CovidService {
    private final RestTemplate restTemplate;
    private static String url = "https://raw.githubusercontent.com/pcm-dpc/COVID-19/master/dati-province/dpc-covid19-ita-province-20200224.csv";

    @Autowired
    public CovidService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Object> getCovid() {
        Object[] covid = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(covid);
    }
}
