package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Evenement;
import com.example.demo.repository.EvenementRepository;

@Service
public class EvenementImpl implements IEvenementService {

	@Autowired
	EvenementRepository evenementRepository;
	
	@Override
	public Evenement addEvenement(Evenement e) {
		// TODO Auto-generated method stub
		evenementRepository.save(e);
		return e;
	}

	@Override
	public void deleteEvenement(Long id) {
		// TODO Auto-generated method stub
		evenementRepository.deleteById(id);
	}

	@Override
	public Evenement updateEvenement(Evenement e) {
		// TODO Auto-generated method stub
		return evenementRepository.saveAndFlush(e);
	}

	@Override
	public Evenement findEvenement(Long id) {
		// TODO Auto-generated method stub
		return (Evenement)evenementRepository.findById(id).get();
	}

	@Override
	public List<Evenement> findAll() {
		// TODO Auto-generated method stub
		return evenementRepository.findAll();
	}

	@Override
	public List<Evenement> findByTitre(String titre) {
		// TODO Auto-generated method stub
		return evenementRepository.findByTitre(titre);
	}

	@Override
	public List<Evenement> findByDate(Date date) {
		// TODO Auto-generated method stub
		return evenementRepository.findByDate(date);
	}

	@Override
	public List<Evenement> findByLieu(String lieu) {
		// TODO Auto-generated method stub
		return evenementRepository.findByLieu(lieu);
	}

}
