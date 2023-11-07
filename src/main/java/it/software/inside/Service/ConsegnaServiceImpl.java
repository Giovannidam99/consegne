package it.software.inside.Service;

import it.software.inside.Models.Consegna;
import it.software.inside.Repo.ConsegnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ConsegnaServiceImpl
    implements ConsegnaService {

    @Autowired
    ConsegnaRepository repository;

    public boolean addDelivery(Consegna consegna) {
        repository.save(consegna);
        return true;
    }

    public Iterable<Consegna> getAll() {

        return repository.findAll();
    }

    @Override
    public Consegna saveConsegna(Consegna consegna) {
        return null;
    }

    @Override
    public List<Consegna> fetchOrdiniList() {
        return null;
    }

    @Override
    public Consegna updateConsegna(Consegna consegna, int id) {

        Consegna depDB
                = repository.findById(id).get();

        if (Objects.nonNull(consegna.getDestinazione())
                && !"".equalsIgnoreCase(
                consegna.getDestinazione())) {
            depDB.setDestinazione(
                    consegna.getDestinazione());
        }

        if (Objects.nonNull(
                consegna.getMittente())
                && !"".equalsIgnoreCase(
                consegna.getMittente())) {
            depDB.setMittente(
                    consegna.getMittente());

        }


        return repository.save(depDB);
    }


    // Delete operation
    @Override
    public void deleteConsegnaById(int id) {
        repository.deleteById(id);
    }
}





