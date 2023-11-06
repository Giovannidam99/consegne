package it.software.inside.Service;


import it.software.inside.Models.Consegna;
import it.software.inside.Repo.ConsegnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsegnaService {

    @Autowired
    ConsegnaRepository repository;

    public boolean addDelivery(Consegna consegna) {
        repository.save(consegna);
        return true;
    }

    public List<Consegna> getAll() {
        return repository.findAll();
    }



}
