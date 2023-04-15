package com.prenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.model.Utente;

@Repository
public interface Utente_DAO extends CrudRepository<Utente, Long> {

}
