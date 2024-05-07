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
public class Locataire {
	



	public Locataire() {
		super();
	}

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long locataireId;

	private String name;
	
	
	
	public Locataire(String name,Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	
	

	public Locataire(String name, Account account, Set<Logement> logements) {
		super();
		this.name = name;
		this.account = account;
		this.logements = logements;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@OneToOne
	@JoinColumn(name="accountid")
	private Account account;

	@ManyToMany(mappedBy="locataires")
	private Set<Logement> logements;

	public Set<Logement> getLogements() {
		return logements;
	}

	public void setLogements(Set<Logement> logements) {
		this.logements = logements;
	}

}
