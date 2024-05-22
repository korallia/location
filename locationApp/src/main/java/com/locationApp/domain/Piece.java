package com.locationApp.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Piece {

	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	 
	private String nom;
	private int taille;
	private int hauteur;
	private int largeur;
	private String etage;
	
	
	
	
	public Piece(String nom, int taille, int hauteur, int largeur, String etage) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.etage = etage;
	}
	
	public Piece() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}

	@Override
	public String toString() {
		return "Piece [id=" + id + ", nom=" + nom + ", taille=" + taille + ", hauteur=" + hauteur + ", largeur="
				+ largeur + ", etage=" + etage + "]";
	}
	
	

	
	
	

}
