package com.locationApp.web;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.locationApp.domain.Locataire;
import com.locationApp.domain.Logement;
import com.locationApp.domain.LogementRepository;
import com.locationApp.domain.Proprietaire;
import com.locationApp.domain.ProprietaireRepository;

@RestController
public class ProprietaireControlleur {
	
	
	
	public ProprietaireControlleur(ProprietaireRepository repository) {
		this.repository = repository;
	}




	private final ProprietaireRepository repository;

	
	
	@GetMapping("/proprietaires")
	public Iterable<Proprietaire> getLogements(){
		return repository.findAll();
		
	}
	@GetMapping("/proprietaires/{id}")
	public Optional<Proprietaire> getLogementbyId(@PathVariable("id")  Long id){
		return repository.findById(id);
		
	}
	
	
}
