package com.locationApp.domain;


import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Logement {
	
		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private Long logementId;
		
		
		protected int loyer;
		protected int surface;
		
		protected String pays,province,ville,adresse,codePostal,description,nom;
		
		
		
		//to do historique (sprint 2 pour le chat)
		//to do photos
		
		
		@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
		@JoinColumn(name = "logement_id")
		private  Set<Piece> pieces;

		@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.PERSIST)
		@JoinTable(name="logements_locataire",joinColumns=
			
				{
					@JoinColumn(name="logementId")	},
				inverseJoinColumns=
			{
				@JoinColumn(name="locataireid"),
				
			}
		
				)		
		private Set<Locataire> locataires;
		
		


		@ManyToMany(fetch = FetchType.EAGER,cascade=CascadeType.PERSIST)
		@JoinTable(name="logements_proprietaire",joinColumns=
			
				{
					@JoinColumn(name="logementId")	},
				inverseJoinColumns=
			{
				@JoinColumn(name="propietaireid"),
				
			}
		
				)
				
		private Set<Proprietaire> proprietaires;
		
		
		



		@Override
		public String toString() {
			return "Logement [logementId=" + logementId + ", loyer=" + loyer + ", surface=" + surface + ", pays=" + pays
					+ ", province=" + province + ", ville=" + ville + ", adresse=" + adresse + ", codePostal="
					+ codePostal + ", description=" + description + ", nom=" + nom + ", pieces=" + pieces
					+ ", locataires=" + locataires + ", proprietaires=" + proprietaires + "]";
		}




		public Logement(int loyer, int surface, String pays, String province, String ville, String adresse,
				String codePostal, String description, String nom, Set<Locataire> locataires,
				Set<Proprietaire> proprietaires) {
			super(); 
			this.loyer = loyer;
			this.surface = surface;
			this.pays = pays;
			this.province = province;
			this.ville = ville;
			this.adresse = adresse;
			this.codePostal = codePostal;
			this.description = description;
			this.nom = nom;
			this.pieces = pieces;
			this.locataires = locataires;
			this.proprietaires = proprietaires;
		}
		
		


		public Logement(int loyer, int surface, String pays, String province, String ville, String adresse,
				String codePostal, String description, String nom, Set<Locataire> locataires) {
			super();
			this.loyer = loyer;
			this.surface = surface;
			this.pays = pays;
			this.province = province;
			this.ville = ville;
			this.adresse = adresse;
			this.codePostal = codePostal;
			this.description = description;
			this.nom = nom;
			this.locataires = locataires;
		}



		public Logement() {
			super();
		}
		
		




		public Logement(int loyer, int surface, String pays, String province, String ville,
				String adresse, String codePostal, String description, String nom) {
			super();
			this.loyer = loyer;
			this.surface = surface;
			this.pays = pays;
			this.province = province;
			this.ville = ville;
			this.adresse = adresse;
			this.codePostal = codePostal;
			this.description = description;
			this.nom = nom;
		}



		public Set<Piece> getPieces() {
			return pieces;
		}





		public void setPieces(Set<Piece> pieces) {
			this.pieces = pieces;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public int getLoyer() {
			return loyer;
		}


		public void setLoyer(int loyer) {
			this.loyer = loyer;
		}

		public int getSurface() {
			return surface;
		}


		public void setSurface(int surface) {
			this.surface = surface;
		}


		public String getPays() {
			return pays;
		}


		public void setPays(String pays) {
			this.pays = pays;
		}


		public String getProvince() {
			return province;
		}


		public void setProvince(String province) {
			this.province = province;
		}


		public String getVille() {
			return ville;
		}


		public void setVille(String ville) {
			this.ville = ville;
		}


		public String getAdresse() {
			return adresse;
		}


		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}


		public String getCodePostal() {
			return codePostal;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}



		public void setCodePostal(String codePostal) {
			this.codePostal = codePostal;
		}
		
		

}
