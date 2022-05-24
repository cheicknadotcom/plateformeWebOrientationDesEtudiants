package com.webPlateformeOrientation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webPlateformeOrientation.Entity.Universite;
import com.webPlateformeOrientation.Repository.UniversiteRepository;
import com.webPlateformeOrientation.service.UniversiteService;
@Controller
//@RequestMapping(path = "web/plateforme/univerty")
public class UniversiteController {
	
	@Autowired
	UniversiteService universiteService;
	@Autowired
	UniversiteRepository universiteRepository;
	public UniversiteController(UniversiteService universiteService) {
		this.universiteService = universiteService;
	}

	public UniversiteService getUniversiteService() {
		return universiteService;
	}
	

	@RequestMapping("/universite")
	public String showUniversites()
	{
		return "infosUniversite";
	}
	@RequestMapping("/universites")
	public String ajouterUniversites(Universite universite)
	{
		universiteRepository.save(universite);
		return "AccueilPrincipal";
	}
	@RequestMapping("/universitees")
	public String ajouterUniversitees(Universite universite)
	{
		universiteRepository.save(universite);
		return "administrateur";
	}
	
}
