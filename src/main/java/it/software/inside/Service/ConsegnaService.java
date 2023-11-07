package it.software.inside.Service;
import it.software.inside.Models.Consegna;

import java.util.List;

public interface ConsegnaService {
    // Save operation
    Consegna saveConsegna (Consegna consegna);

    // Read operation
    List<Consegna> fetchOrdiniList();

    // Update operation
    Consegna updateConsegna(Consegna consegna, int id);

    // Delete operation
    void deleteConsegnaById(int id);
}
