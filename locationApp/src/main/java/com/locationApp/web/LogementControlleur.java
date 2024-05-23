package com.locationApp.web;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.locationApp.domain.Logement;
import com.locationApp.domain.LogementRepository;

import jakarta.websocket.server.PathParam;

@RestController
public class LogementControlleur {
	
	
	
	public LogementControlleur(LogementRepository repository) {
		this.repository = repository;
	}




	private final LogementRepository repository;

	
	/*
	@GetMapping("/logements")
	public Iterable<Logement> getLogements(){
		return repository.findAll();
		
	}
	*/
	
	
	
	
	
	
	
}
