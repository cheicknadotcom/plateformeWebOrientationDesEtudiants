package com.webPlateformeOrientation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webPlateformeOrientation.Entity.Offres;
import com.webPlateformeOrientation.Repository.OffresRepository;

@Controller
public class OffresController {
	@Autowired
	OffresRepository offresRepository;
	@Autowired
	PagesController pagesController;
	
	@GetMapping("/offres")
	public String showOffres(Model model)
	{
		Offres offres = new Offres();
		//offres.setEntreprise((Entreprise)pagesController.getUsers());
		model.addAttribute("offres", offres);
		return "FormulaireOffres";
	}
	@RequestMapping("/saveOffres")
	public String sauvegardeOfres(Offres offres)
	{
		offresRepository.save(offres);
		return "successfulloffres";
	}
}
