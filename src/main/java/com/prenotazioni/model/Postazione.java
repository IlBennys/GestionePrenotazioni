package com.prenotazioni.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "postazione")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//@Inheritance(strategy = InheritanceType.JOINED)
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descrizionepostazione")
    private String descrizionePostazione;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;
    @Column(name = "numMaxoccupanti")
    private Integer numMaxOccupanti;
    @Column(name = "edificio")
    private Edificio edificio;

}
