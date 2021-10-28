package tn.esprit.spring.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.repository.FournisseurRepository;


@Service
public class FournisseurServiceImpl implements FournisseurService {
	@Autowired
	FournisseurRepository FournisseurRepository;
	private static final Logger l= LogManager.getLogger(FournisseurServiceImpl.class);
	@Override
	public List<Fournisseur> retriveAllfournisseurs() {
		 List<Fournisseur> fournisseurs =(List<Fournisseur>) FournisseurRepository.findAll();
		  
		  for(Fournisseur fournisseur :fournisseurs)
		  {	l.info("Fournisseur +++ :"+fournisseur);	  }
		  return fournisseurs;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur f) {
		return FournisseurRepository.save(f);
	}

	@Override
	public void deleteFournisseur(Long fournisseurId) {
		FournisseurRepository.deleteById(fournisseurId); 
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur f) {
		FournisseurRepository.save(f); 
		return f;
	}

	@Override
	public Optional<Fournisseur> retrieveFournisseur(Long fournisseurId) {
		return FournisseurRepository.findById(fournisseurId);

	}

}
