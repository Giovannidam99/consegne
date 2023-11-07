package it.software.inside.Controller;

import it.software.inside.Models.Consegna;
import it.software.inside.Service.ConsegnaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ConsegnaController {
    @Autowired
    ConsegnaServiceImpl service;

    @PostMapping("/consegne")
    public boolean addDelivery(@RequestBody Consegna consegna) {

        return service.addDelivery(consegna);
    }

    @GetMapping("/consegne/getAll")
    public Iterable<Consegna> getAll() {

        return service.getAll();
    }


}


