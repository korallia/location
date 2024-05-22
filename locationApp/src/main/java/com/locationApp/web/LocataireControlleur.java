package com.locationApp.web;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.locationApp.domain.Locataire;
import com.locationApp.domain.LocataireRepository;
import com.locationApp.domain.Logement;
import com.locationApp.domain.LogementRepository;

@RestController
public class LocataireControlleur {
	
	
	
	public LocataireControlleur(LocataireRepository repository) {
		this.repository = repository;
	}




	private final LocataireRepository repository;

	
	
	@GetMapping("/locataires")
	public Iterable<Locataire> getLogements(){
		return repository.findAll();
		
	}
	@GetMapping("/locataires/{id}")
	public Optional<Locataire> getLogementbyId(@PathVariable("id")  Long id){
		return repository.findById(id);
		
	}
	
	
}
