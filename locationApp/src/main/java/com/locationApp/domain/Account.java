package com.locationApp.domain;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Account {

	public Account() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long accountId;
	

	
	private String name;
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(String name) {
		super();
		this.name = name;
	}
	
	
	
	
}
