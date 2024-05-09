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
	


	@OneToOne
	@JoinColumn(name="account_id")
	private Account account;
	
	
	@ManyToMany(mappedBy="proprietaires")
	private Set<Logement> logements;

	
	public Proprietaire(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	

	public Proprietaire() {
		super();
	}







	@Override
	public String toString() {
		return "Proprietaire [proprietaireId=" + proprietaireId + ", name=" + name + ", account=" + account +"]";
	}
	
	

}
