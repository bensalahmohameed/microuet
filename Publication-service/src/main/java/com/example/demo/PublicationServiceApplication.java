package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;

@SpringBootApplication
public class PublicationServiceApplication implements CommandLineRunner {

	@Autowired
	IPublicationService publicationService;

	
	public static void main(String[] args) {
		SpringApplication.run(PublicationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Publication p1 = new  Publication();
		p1.setDate(new Date());
		p1.setLien("lien1");
		p1.setTitre("titre1");
		publicationService.addPublication(p1);
		Publication p2 = new  Publication();
		p2.setDate(new Date());
		p2.setLien("lien2");
		p2.setTitre("titre2");
		publicationService.addPublication(p2);
	
		
	}

}
