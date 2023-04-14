package com.prenotazioni.service;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.prenotazioni.model.Edificio;
import com.prenotazioni.model.Postazione;
import com.prenotazioni.model.Utente;
import com.prenotazioni.repository.Edificio_DAO;
import com.prenotazioni.repository.Postazione_DAO;
import com.prenotazioni.repository.Utente_DAO;

@Service
public class Prenotazioni_Service {
    @Autowired
    private Edificio_DAO repoE;
    @Autowired
    private Utente_DAO repoU;
    @Autowired
    private Postazione_DAO repoP;

    @Autowired
    @Qualifier("FakePostazione")
    private ObjectProvider<Postazione> fakePostazioneProvider;
    @Autowired
    @Qualifier("FakeEdificio")
    private ObjectProvider<User> fakeEdificioProvider;
    @Autowired
    @Qualifier("FakeUtente")
    private ObjectProvider<Utente> fakeUtenteProvider;

    public void FakePostazione() {
	insertPostazione(fakePostazioneProvider.getObject());
	// insertUtente(FakeUtente.getObject());
	// insertEdificio(FakeEdificio.getObject());
    }

    public void insertEdificio(Edificio e) {
	repoE.save(e);
    }

    public void insertUtente(Utente u) {
	repoU.save(u);
    }

    public void insertPostazione(Postazione p) {
	repoP.save(p);
    }

}
