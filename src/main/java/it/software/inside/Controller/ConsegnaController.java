package it.software.inside.Controller;

import it.software.inside.Models.Consegna;
import it.software.inside.Service.ConsegnaService;
import it.software.inside.Service.ConsegnaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ConsegnaController {
    @Autowired
    private ConsegnaService consegnaService;

    @PostMapping("/consegne")
    public Consegna addDelivery(@RequestBody Consegna consegna) {


        return consegnaService.saveConsegna(consegna);
    }

    @GetMapping("/consegne/getAll")
    public List<Consegna> getAll() {

        return consegnaService.fetchConsegnaList();
    }

    // Update operation
    @PutMapping("/consegne/{id}")
    public Consegna updateConsegne(@RequestBody Consegna consegne, @PathVariable("id") int id) {
        return consegnaService.updateConsegna (consegne,id);
    }

    // Delete operation
    @DeleteMapping("/consegne/{id}")
    public String deleteconsegnaById(@PathVariable("id") int id) {
        consegnaService.deleteConsegnaById(id);
        return "Deleted Successfully";
    }


}


