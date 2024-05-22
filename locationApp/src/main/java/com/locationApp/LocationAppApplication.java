package com.locationApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import java.awt.Dimension;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.locationApp.domain.*;

@SpringBootApplication
@Configuration
public class LocationAppApplication implements CommandLineRunner {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(LocationAppApplication.class);
	
	private final LogementRepository logementRepository;
	private final PieceRepository pieceRepository;
	private final AccountRepository accountRepository;
	private final LocataireRepository locationRepository;
	private final ProprietaireRepository proprietaireRepository;

	public static void main(String[] args) {
		SpringApplication.run(LocationAppApplication.class, args);
	}

	

	public LocationAppApplication(LogementRepository logementRepository, PieceRepository pieceRepository,
			AccountRepository accountRepository, LocataireRepository locationRepository,ProprietaireRepository proprietaireRepository) {
		this.logementRepository = logementRepository;
		this.pieceRepository = pieceRepository;
		this.accountRepository = accountRepository;
		this.locationRepository = locationRepository;
		this.proprietaireRepository = proprietaireRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		
		
		Logement immeuble2 = new Logement(1000,1200,"canada","qc","ville","adress","codepostal","description","test2");
		
		Account account1 = new Account("test");
		accountRepository.save(account1);
		
		Locataire locataire = new Locataire("Locatairetest",account1);
		Set<Locataire> locataires = new HashSet<>();
		locataires.add(locataire);
		
		Proprietaire proprietaire = new Proprietaire("proprietairetest",account1);
		Set<Proprietaire> proprietaires = new HashSet<>();
		proprietaires.add(proprietaire);
		
		Set<Piece> pieces = new HashSet<>();
		Piece piece1 = new Piece("test1",200,10,20,"1");
		Piece piece2 = new Piece("test2",200,10,20,"2");
		pieces.add(piece1);
		pieces.add(piece2);
		
		
		Logement immeuble1 = new Logement(1000,1200,"canada","qc","ville","adress","codepostal","description","test1", pieces,locataires,proprietaires);
		//immeuble1.setPieces(pieces);
		
		
		
		logementRepository.save(immeuble1);
		Iterable<Proprietaire> logements = proprietaireRepository.findAll();
		 for (Proprietaire logement1 : logements) {
			 System.out.println(logement1); 
		 }
		
		/*
		Optional<Logement> logement = logementRepository.findById((long) 1);
				//System.out.println(logement.get());
		
				Iterable<Logement> logements = logementRepository.findAll();
				 for (Logement logement1 : logements) {
					 System.out.println(logement1); 
				 }
				 */
		/*
		immeubleRepository.save(immeuble2);
		
		locationRepository.save(locataire);
		
		immeubleRepository.save(new Logement(1000,1200,"canada","qc","ville","adress","codepostal","description","test3"));
		*/
		
		//pieceRepository.save(new Piece("test1",200,10,20,"1"));
		//pieceRepository.save(new Piece("test2",200,10,20,"2"));
		
		
		
		
		
		
		

		
	}
	

}
