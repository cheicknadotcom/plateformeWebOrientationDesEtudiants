package com.webPlateformeOrientation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webPlateformeOrientation.Entity.Entreprise;
import com.webPlateformeOrientation.Repository.EntrepriseRepository;
@Controller
public class EntrepriseController {

	@Autowired
	EntrepriseRepository entrepriseRepository;

	@RequestMapping("/entreprises")
	public String ajouterEntreprise(Entreprise entreprise)
	{
		entrepriseRepository.save(entreprise);
		return "AccueilPrincipal";
	}
	@RequestMapping("/entreprise")
	public String getEntreprises(Model model)
	{
		//model.addAttribute("newEntreprise", new Entreprise());
		return "infosEntreprise";
	}
	@RequestMapping("/entreprisees")
	public String ajouterEntreprises(Entreprise entreprise)
	{
		entrepriseRepository.save(entreprise);
		return "administrateur";
	}
}
