package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Fournisseur implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	public Long fournisseurId;
	public String nom;
	public String prenom;
	public String contact;
	public String email;
	public int portable;
	public String place;
	public Long getFournisseurId() {
		return fournisseurId;
	}
	public void setFournisseurId(Long fournisseurId) {
		this.fournisseurId = fournisseurId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPortable() {
		return portable;
	}
	public void setPortable(int portable) {
		this.portable = portable;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Fournisseur(Long fournisseurId, String nom, String prenom, String contact, String email, int portable,
			String place) {
		super();
		this.fournisseurId = fournisseurId;
		this.nom = nom;
		this.prenom = prenom;
		this.contact = contact;
		this.email = email;
		this.portable = portable;
		this.place = place;
	}
	public Fournisseur(String nom, String prenom, String contact, String email, int portable, String place) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.contact = contact;
		this.email = email;
		this.portable = portable;
		this.place = place;
	}
	@Override
	public String toString() {
		return "fournisseur [fournisseurId=" + fournisseurId + ", nom=" + nom + ", prenom=" + prenom + ", contact="
				+ contact + ", email=" + email + ", portable=" + portable + ", place=" + place + "]";
	}
	
	
	

}
