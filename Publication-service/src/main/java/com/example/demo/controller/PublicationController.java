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

import com.example.demo.entities.Publication;
import com.example.demo.service.IPublicationService;

@RestController
@CrossOrigin
public class PublicationController {
	
	@Autowired
	IPublicationService publicationService;
	
	@RequestMapping(value="/publications",method=RequestMethod.GET)
	public List<Publication> findPublications(){
		return publicationService.findAll();
	}
	
	@GetMapping(value="/publication/{id}")
	public Publication findOnePublicationById(@PathVariable Long id) {
		return publicationService.findPublication(id);
	}
	
	@PostMapping(value="/publications/publication")
	public Publication addPublication(@RequestBody Publication p) {
		return publicationService.addPublication(p);
	}
	
	@DeleteMapping(value = "/publications/{id}")
	public void deletePublication(@PathVariable Long id)
	{
		publicationService.deletePublication(id);
	}
	
	@PutMapping(value = "/publications/publication/{id}")
	public Publication updatePublication(@PathVariable Long id,@RequestBody Publication p) {
		p.setId(id);
		return publicationService.updatePublication(p);
	}
	
	@GetMapping(value="/publication/search/titre")
	public List<Publication> findOnePublicationByTitre(@RequestParam String titre)
	{
		return publicationService.findByTitre(titre);
	}
	@GetMapping(value="/publication/search/lien")
	public List<Publication> findOnePublicationByLien(@RequestParam String lien)
	{
		return publicationService.findByLien(lien);
	}
	@GetMapping(value="/publication/search/type")
	public List<Publication> findOnePublicationByType(@RequestParam String type)
	{
		return publicationService.findByType(type);
	}
	

}
