package com.locationApp.domain;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long proprietaireId;

	private String name;

	@OneToOne
	@JoinColumn(name = "account_id")
	private Account account;

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "proprietaires")
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
		return "Proprietaire [proprietaireId=" + proprietaireId + ", name=" + name + ", account=" + account
				+ ", logements=" + logements + "]";
	}

	public Long getProprietaireId() {
		return proprietaireId;
	}

	public void setProprietaireId(Long proprietaireId) {
		this.proprietaireId = proprietaireId;
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

	public Set<Logement> getLogements() {
		return logements;
	}

	public void setLogements(Set<Logement> logements) {
		this.logements = logements;
	}

}
