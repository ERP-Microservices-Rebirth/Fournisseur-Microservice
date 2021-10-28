package tn.esprit.spring.control;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Fournisseur;
import tn.esprit.spring.service.*;
 @RestController
public class FournisseurController {
	@Autowired
	FournisseurService FournisseurService;
	
	@GetMapping("/retrieve-all-fournisseurs")
	@ResponseBody
	public List<Fournisseur> retriveAllfournisseurs() {
	List<Fournisseur> list = FournisseurService.retriveAllfournisseurs();
	return list;
	}
	@PostMapping("/add-user")
	@ResponseBody
	public Fournisseur addFournisseur(@RequestBody Fournisseur f) {

	Fournisseur fournisseur = FournisseurService.addFournisseur(f);

	return fournisseur;
	}
	@DeleteMapping("/delete-fournisseur/{fournisseurId}")
	@ResponseBody
	public void deleteFournisseur(@PathVariable("fournisseurId") Long fournisseurId) {
	FournisseurService.deleteFournisseur(fournisseurId);
	}
	
	@PutMapping("/modify-fournisseur")
	@ResponseBody
	public Fournisseur updateFournisseur(@RequestBody Fournisseur fournisseur) {
	return FournisseurService.updateFournisseur(fournisseur);
	}
	
	@GetMapping("/retrieve-fournisseur/{fournisseurId}")
	@ResponseBody
	public Optional<Fournisseur> getFournisseur(@PathVariable("fournisseurId") Long fournisseurId) {
	 return FournisseurService.retrieveFournisseur(fournisseurId);
	}
	
}
