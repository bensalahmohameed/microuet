package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Publication;
import com.example.demo.repository.PublicationRepository;

@Service
public class PublicationImpl implements IPublicationService {
	
	@Autowired
	PublicationRepository PublicationRepository;
	

	@Override
	public Publication addPublication(Publication m) {
		PublicationRepository.save(m);
		return m;
	}

	@Override
	public void deletePublication(Long id) {
		PublicationRepository.deleteById(id);
	}

	@Override
	public Publication updatePublication(Publication p) {
		// TODO Auto-generated method stub
		return PublicationRepository.saveAndFlush(p);
	}

	@Override
	public Publication findPublication(Long id) {
		// TODO Auto-generated method stub
		return (Publication)PublicationRepository.findById(id).get();
	}

	@Override
	public List<Publication> findAll() {
		return PublicationRepository.findAll();
	}




	@Override
	public List<Publication> findByTitre(String titre) {
		// TODO Auto-generated method stub
		return PublicationRepository.findByTitre(titre);
	}

	@Override
	public List<Publication> findByDate(Date date) {
		// TODO Auto-generated method stub
		return PublicationRepository.findByDate(date);
	}

	@Override
	public List<Publication> findBySourcepdf(String sourcepdf){
		// TODO Auto-generated method stub
		return PublicationRepository.findBySourcepdf(sourcepdf);
	}

	@Override
	public List<Publication> findByType(String type) {
		// TODO Auto-generated method stub
		return PublicationRepository.findByType(type);
	}
	@Override
	public List<Publication> findByLien(String lien){
		// TODO Auto-generated method stub
		return PublicationRepository.findByLien(lien);
	}

}
