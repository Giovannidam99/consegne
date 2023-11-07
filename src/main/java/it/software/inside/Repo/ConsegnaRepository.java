package it.software.inside.Repo;

import it.software.inside.Models.Consegna;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsegnaRepository extends CrudRepository<Consegna, Integer> {
}
