package com.example.demo.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Outil;
import com.example.demo.repository.OutilRepository;

@Service
public class OutilImpl implements IOutilService {

	@Autowired
	OutilRepository outilRepository;
	
	@Override
	public Outil addOutil(Outil o) {

		outilRepository.save(o);
		return o;
	}

	@Override
	public void deleteOutil(Long id) {

		outilRepository.deleteById(id);
	}

	@Override
	public Outil updateOutil(Outil o) {
		// TODO Auto-generated method stub
		return outilRepository.saveAndFlush(o);
	}

	@Override
	public Outil findOutil(Long id) {
		Outil o =(Outil)outilRepository.findById(id).get();
		return o;
	}

	@Override
	public List<Outil> findAll() {
		return outilRepository.findAll();
	}

	@Override
	public List<Outil> findByDate(Date date) {
		// TODO Auto-generated method stub
		return outilRepository.findByDate(date);	
	}

	@Override
	public List<Outil> findBySource(String source) {
		// TODO Auto-generated method stub
		return outilRepository.findBySource(source);
	}

}
