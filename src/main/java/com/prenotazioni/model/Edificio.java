package com.prenotazioni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "edificio")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data

//@Builder
public class Edificio {
    @Column(name = "nome")
    private String nome;
    @Column(name = "indirizzo")
    private String indirizzo;
    @Column(name = "citta")
    private String città;
}
