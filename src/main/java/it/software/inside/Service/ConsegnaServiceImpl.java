package it.software.inside.Service;

import it.software.inside.Models.Consegna;
import it.software.inside.Repo.ConsegnaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ConsegnaServiceImpl {

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
    public Consegna updateConsegna(Consegna consegna, int id) {

        Consegna depDB
                = repository.findById(id).get();

        if (Objects.nonNull(Consegna.getDestinazione())
                && !"".equalsIgnoreCase(
                consegna.getNome())) {
            depDB.setNome(
                    ordini.getNome());
        }

        if (Objects.nonNull(
                ordini.getCognome())
                && !"".equalsIgnoreCase(
                ordini.getCognome())) {
            depDB.setCognome(
                    ordini.getCognome());
        }

        if (Objects.nonNull(ordini.getProdotto())
                && !"".equalsIgnoreCase(
                ordini.getProdotto())) {
            depDB.setProdotto(
                    ordini.getProdotto());
        }
        if (Objects.nonNull(ordini.getMarca())
                && !"".equalsIgnoreCase(
                ordini.getMarca())) {
            depDB.setMarca(
                    ordini.getMarca());
        }

        return ordiniRepository.save(depDB);
    }


    // Delete operation
    @Override
    public void deleteOrdiniById(int id) {
        ordiniRepository.deleteById(id);
    }
}



}
