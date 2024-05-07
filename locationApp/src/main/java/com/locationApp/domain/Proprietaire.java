package com.locationApp.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Proprietaire {
	



	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long proprietaireId;

	private String name;
	
	
	


	public Proprietaire(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}

	@OneToOne
	@JoinColumn(name="account_id")
	private Account account;
/*
	@ManyToMany(mappedBy="locataires")
	private Set<Logement> logements;

	public Set<Logement> getLogements() {
		return logements;
	}

	public void setLogements(Set<Logement> logements) {
		this.logements = logements;
	}
	*/

}
