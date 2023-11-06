package it.software.inside.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "",name = "")
@Entity
public class Consegna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "dest")
    private String destinazione;
    private String mittente;
    private Double peso;



}
