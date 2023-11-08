package it.software.inside.Controller;

import it.software.inside.Models.Consegna;
import it.software.inside.Service.ConsegnaService;
import it.software.inside.Service.ConsegnaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/consegne")
public class ConsegnaController {

    @Autowired
    private ConsegnaService consegnaService;

    @PostMapping
    public Consegna addDelivery(@RequestBody Consegna consegna) {


        return consegnaService.saveConsegna(consegna);
    }

    @GetMapping("/getAll")
    public List<Consegna> getAll() {

        return consegnaService.fetchConsegnaList();
    }

    // Update operation
    @PutMapping("{id}")
    public Consegna updateConsegne(@RequestBody Consegna consegne, @PathVariable("id") int id) {
        return consegnaService.updateConsegna (consegne,id);
    }

    // Delete operation
    @DeleteMapping("{id}")
    public String deleteconsegnaById(@PathVariable("id") int id) {
        consegnaService.deleteConsegnaById(id);
        return "Deleted Successfully";
    }


}


