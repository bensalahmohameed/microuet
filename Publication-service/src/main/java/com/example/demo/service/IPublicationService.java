package com.example.demo.service;

import java.util.Date;
import java.util.List;

import com.example.demo.entities.Publication;

public interface IPublicationService {
	
	//Crud sur les publications
	public Publication addPublication(Publication m);
	public void deletePublication(Long id) ;
	public Publication updatePublication(Publication p) ;
	public Publication findPublication(Long id) ;
	public List<Publication> findAll();
	//Filtrage par propriété
	public List<Publication> findByTitre(String titre);
	public List<Publication> findByDate(Date date);
	public List<Publication> findByLien(String lien);
	public List<Publication> findBySourcepdf(String sourcepdf);
	public List<Publication> findByType(String type);

}
