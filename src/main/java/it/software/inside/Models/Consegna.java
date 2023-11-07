package it.software.inside.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(schema = "public",name = "consegne")
@Entity
@Builder
public class Consegna {
    @Id
    @SequenceGenerator(name = "id_seq", sequenceName = "public.consegne_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    private int id;


    private String destinazione;
    private String mittente;
    private Double peso;



}
