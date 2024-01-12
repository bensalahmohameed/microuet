package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Evenement;


public interface IEvenementService {
	
	//Crud sur les membres
	public Evenement addEvenement(Evenement e);
	public void deleteEvenement(Long id) ;
	public Evenement updateEvenement(Evenement e) ;
	public Evenement findEvenement(Long id) ;
	public List<Evenement> findAll();
	//Filtrage par propriété
	public List<Evenement> findByTitre(String titre);
	public List<Evenement> findByDate(Date date);
	public List<Evenement> findByLieu(String lieu);
	

}
