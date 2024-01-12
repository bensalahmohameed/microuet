package com.example.demo.services;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Outil;



public interface IOutilService {
	
	//Crud sur les membres
		public Outil addOutil(Outil o);
		public void deleteOutil(Long id) ;
		public Outil updateOutil(Outil o) ;
		public Outil findOutil(Long id) ;
		public List<Outil> findAll();
		//Filtrage par propriété
		List<Outil> findByDate(Date date);
		List<Outil> findBySource(String source);
		

}
