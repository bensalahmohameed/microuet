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

import com.example.demo.entities.Outil;
import com.example.demo.services.IOutilService;

@RestController
@CrossOrigin
public class OutilController {
	
	@Autowired
	IOutilService outilService;
	
	@RequestMapping(value="/outils",method=RequestMethod.GET)
	public List<Outil> findOutils(){
		return outilService.findAll();
	}
	@GetMapping(value="/outil/{id}")
	public Outil findOneOutilById(@PathVariable Long id) {
		return outilService.findOutil(id);
	}
	
	@GetMapping(value="/outil/search/source")
	public List<Outil> findOneOutilBySource(@RequestParam String source)
	{
		return outilService.findBySource(source);
	}
	
	@PostMapping(value="outils/outil")
	public Outil addOutil(@RequestBody Outil o) {
		return outilService.addOutil(o);
	}
	
	@DeleteMapping(value = "/outils/{id}")
	public void deleteOutil(@PathVariable Long id)
	{
		outilService.deleteOutil(id);
	}
	
	@PutMapping(value = "/outils/outil/{id}")
	public Outil updateoutil(@PathVariable Long id,@RequestBody Outil o) {
		o.setId(id);
		return outilService.updateOutil(o);
	}
	
	

}










