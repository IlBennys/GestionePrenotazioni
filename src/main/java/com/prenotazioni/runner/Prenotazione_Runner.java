package com.prenotazioni.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.prenotazioni.service.Prenotazioni_Service;

//import com.jpac_project.service.UserService;

@Component
public class Prenotazione_Runner implements ApplicationRunner {

    @Autowired
    Prenotazioni_Service pippo;

    @Override
    public void run(ApplicationArguments args) throws Exception {
	System.out.println("Run...");
	pippo.FakePostazione();
    }

}