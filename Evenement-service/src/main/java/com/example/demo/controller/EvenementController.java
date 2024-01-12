package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Evenement;
import com.example.demo.service.IEvenementService;

@RestController
@CrossOrigin
public class EvenementController {

	@Autowired
	IEvenementService evenementService;
	
	@RequestMapping(value="/evenements",method=RequestMethod.GET)
	public List<Evenement> findEvenements(){
		return evenementService.findAll();
	}
	
	@GetMapping(value="/evenement/{id}")
	public Evenement findOneEvenementById(@PathVariable Long id) {
		return evenementService.findEvenement(id);
	}
	
	
	@GetMapping(value="/evenement/search/titre")
	public List<Evenement> findOneEvenementByTitre(@RequestParam String titre)
	{
		return evenementService.findByTitre(titre);
	}
	@GetMapping(value="/evenement/search/lieu")
	public List<Evenement> findOneEvenementByLieu(@RequestParam String lieu)
	{
		return evenementService.findByLieu(lieu);
	}
	
	@PostMapping(value="/evenements/evenement")
	public Evenement addEvenement(@RequestBody Evenement e) {
		return evenementService.addEvenement(e);
	}
	
	@DeleteMapping(value = "/evenements/{id}")
	public void deleteEvenement(@PathVariable Long id)
	{
		evenementService.deleteEvenement(id);
	}
	
	@PutMapping(value = "/evenements/evenement/{id}")
	public Evenement updateEvenement(@PathVariable Long id,@RequestBody Evenement e) {
		e.setId(id);
		return evenementService.updateEvenement(e);
	}
}
