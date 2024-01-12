package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
	
	public List<Evenement> findByDate(Date date);
	public List<Evenement> findByLieu(String lieu);
	public List<Evenement> findByTitre(String titre);

}
