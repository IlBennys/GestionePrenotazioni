package com.prenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prenotazioni.model.Edificio;

@Repository
public interface Edificio_DAO extends CrudRepository<Edificio, Long> {

}
