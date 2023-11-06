package it.software.inside.Controller;

import it.software.inside.Models.Consegna;
import it.software.inside.Service.ConsegnaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/consegna")
public class ConsegnaController {
    @Autowired
    ConsegnaService service;

    @PostMapping
    public boolean addDelivery(@RequestBody Consegna consegna) {
        return service.addDelivery(consegna);
    }

    @GetMapping
    public Iterable<Consegna> getAll() {
        return service.getAll();
    }
}


