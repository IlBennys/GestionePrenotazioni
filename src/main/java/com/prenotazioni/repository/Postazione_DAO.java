package com.prenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.model.Postazione;

@Repository
public interface Postazione_DAO extends CrudRepository<Postazione, Long> {

}
