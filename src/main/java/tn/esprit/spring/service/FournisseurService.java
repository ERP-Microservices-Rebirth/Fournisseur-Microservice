package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import tn.esprit.spring.entity.Fournisseur;


public interface FournisseurService {
	 public List<Fournisseur> retriveAllfournisseurs();
	 public Fournisseur addFournisseur(Fournisseur f);
	 public void deleteFournisseur(Long fournisseurId);
	 public Fournisseur updateFournisseur(Fournisseur f);
	 public Optional<Fournisseur> retrieveFournisseur(Long fournisseurId);
}
