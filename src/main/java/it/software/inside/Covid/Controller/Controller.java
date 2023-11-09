package it.software.inside.Covid.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class Controller {

    @GetMapping
    public ResponseEntity<Object> getAll() {

        // conversione a json
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        messageConverters.add(converter);
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);

        // Get Call

        String fooResourceUrl
                = "https://github.com/pcm-dpc/COVID-19/blob/master/dati-province/";
        ResponseEntity<Object> response
                = restTemplate.getForEntity(fooResourceUrl + "/dpc-covid19-ita-province-20200224.csv", Object.class);

        return response;
    }


}
