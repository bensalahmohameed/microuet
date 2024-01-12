package com.example.demo.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Publication;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
	
	public List<Publication> findByDate(Date date);
	public List<Publication> findByLien(String lien);
	public List<Publication> findByTitre(String titre);
	public List<Publication> findBySourcepdf(String sourcepdf);
	public List<Publication> findByType(String type);
}
