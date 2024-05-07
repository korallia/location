package com.locationApp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Piece {

	public Piece() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	
	private String nom;
	private int taille;
	private int hauteur;
	private int largeur;
	private String etage;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="immeuble")
	private Logement immeuble;
	
	
	public Logement getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Logement immeuble) {
		this.immeuble = immeuble;
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
	public Piece(String nom, int taille, int hauteur, int largeur, String etage, Logement immeuble) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.etage = etage;
		this.immeuble = immeuble;
	}
	
	
	
	

}
