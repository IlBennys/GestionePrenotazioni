package com.prenotazioni.aziendali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prenotazioni.runner.Prenotazione_Runner;

@SpringBootApplication
public class GestionePrenotazioniApplication {

    public static void main(String[] args) {
	SpringApplication.run(Prenotazione_Runner.class, args);
	/*
	 * SpringApplication.run(GestionePrenotazioniApplication.class, args);
	 * System.out.println("QUESTO E' L'EDIFIZIO SELEZIONATO"); Edificio e = new
	 * Edificio(); e.setCittà("Palermo"); e.setIndirizzo("via ugo la malfa");
	 * e.setNome("Epicode Enterprise"); System.out.println(e);
	 * System.out.println("QUESTA è LA TUA POSTAZIONE"); Postazione p = new
	 * Postazione(); p.setDescrizionePostazione(null); p.setEdificio(e);
	 * p.setNumMaxOccupanti(5); p.setTipo(Tipo.SALA_RIUNIONI);
	 * System.out.println(p);
	 * System.out.println("QUESTO E' L'UTENTE CHE HA PRENOTATO"); Utente u = new
	 * Utente(); u.setCognome("piccolo"); u.setEmail("francorossi@gmail.com");
	 * u.setNome("franco"); u.setPostazione(p); System.out.println(u);
	 */

    }

}
