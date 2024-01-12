package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Outil;
import com.example.demo.repository.OutilRepository;
import com.example.demo.services.IOutilService;

@SpringBootApplication
public class OutilServiceApplication implements CommandLineRunner {

	@Autowired
	OutilRepository outilRepository;
	
	@Autowired
	IOutilService outilService;
	
	public static void main(String[] args) {
		SpringApplication.run(OutilServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Outil outil1= new Outil();
		outil1.setSource("source1");
		outil1.setDate(new Date());
		outilRepository.save(outil1);
		
		Outil outil2= new Outil();
		outil2.setSource("source2");
		outil2.setDate(new Date());
		outilRepository.save(outil2);
		
		Outil outil3= new Outil();
		outil3.setSource("source3");
		outil3.setDate(new Date());
		outilRepository.save(outil3);
		
		Outil outil4= new Outil();
		outil4.setSource("source4");
		outil4.setDate(new Date());
		outilRepository.save(outil4);
		
		Outil outil5= new Outil();
		outil5.setSource("source5");
		outil5.setDate(new Date());
		outilRepository.save(outil5);
		
		
		List<Outil> outils = outilRepository.findAll();
		for (Outil outil : outils) {
			System.out.println(outil.getSource()+ " "+outil.getDate());
		}
		
		Outil o1 = outilRepository.findById(1L).get();
		System.out.println(o1.getSource());
		
		outilRepository.delete(outil3);
		outil1.setSource("sourceModifie");
		outilRepository.save(outil1);
		
		Outil o = outilService.findOutil(2L);
		outilService.deleteOutil(4L);
		
	}

}
