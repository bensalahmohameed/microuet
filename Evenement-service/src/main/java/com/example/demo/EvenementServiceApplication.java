package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Evenement;
import com.example.demo.repository.EvenementRepository;
import com.example.demo.service.IEvenementService;

@SpringBootApplication
public class EvenementServiceApplication implements CommandLineRunner{

	@Autowired
	IEvenementService evenementService;
	
	@Autowired
	EvenementRepository evenementRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(EvenementServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Evenement e1 = new  Evenement();
		e1.setDate(new Date());
		e1.setLieu("lieu1");
		e1.setTitre("titre1");
		evenementService.addEvenement(e1);
		Evenement e2 = new  Evenement();
		e2.setDate(new Date());
		e2.setLieu("lieu2");
		e2.setTitre("titre2");
		evenementService.addEvenement(e2);
		
		Evenement event1 = new Evenement();
		event1.setDate(new Date());
		event1.setLieu("lieu11");
		event1.setTitre("titre11");
		evenementRepository.save(event1);
		
		Evenement event2 = new Evenement();
		event2.setDate(new Date());
		event2.setLieu("lieu22");
		event2.setTitre("titre22");
		evenementRepository.save(event2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
