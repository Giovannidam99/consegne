package it.software.inside.Service;

import it.software.inside.Models.Consegna;
import it.software.inside.Repository.ConsegnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Objects;

@Service
public class ConsegnaServiceImpl implements ConsegnaService {

    @Autowired
    ConsegnaRepository repository;

    @Override
    public Consegna saveConsegna(Consegna consegna) {
        return repository.save(consegna);
    }

    @Override
    public List<Consegna> fetchConsegnaList() {

        return (List<Consegna>) repository.findAll();
    }

    @Override
    public Consegna updateConsegna(Consegna consegna, int id) {

        Consegna depDB = repository.findById(id).get();

        if (Objects.nonNull(consegna.getDestinazione())
                && StringUtils.hasLength(consegna.getDestinazione())) {
            depDB.setDestinazione(
                    consegna.getDestinazione());
        }

        if (Objects.nonNull(
                consegna.getMittente())
                && StringUtils.hasLength(consegna.getMittente())) {
            depDB.setMittente(
                    consegna.getMittente());

        }

        if (consegna.getPeso() != 0) {
            depDB.setPeso(consegna.getPeso());
        }

        return repository.save(depDB);
    }


    // Delete operation
    @Override
    public void deleteConsegnaById(int id) {
        repository.deleteById(id);
    }
}





