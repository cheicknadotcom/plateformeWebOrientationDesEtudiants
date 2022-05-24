package com.webPlateformeOrientation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webPlateformeOrientation.Entity.Etudiant;
import com.webPlateformeOrientation.Entity.ThequeCV;
import com.webPlateformeOrientation.Repository.ThequeCvRepository;

@Controller
public class ThequeCVController {
	@Autowired
	ThequeCvRepository cvRepository;
	
	@Autowired
	PagesController pagesController;
	
	@RequestMapping("/thequeCV")
	public String showTequeCV(Model model)
	{
		
		ThequeCV cv = new ThequeCV();
		cv.setEtudiant((Etudiant)pagesController.getUsers());
		//System.err.println(pagesController.getUsers().getId());
		model.addAttribute("moncv", cv);
		return "FormulaireCV";
	}
	
	
	@RequestMapping("/saveCV")
	public String sauvegardeCv(@ModelAttribute("moncv") ThequeCV cv)
	{
		cvRepository.save(cv);
		return "successfull";
		//return "redirect:/EspaceEtudiant";
	}
	@RequestMapping("/listeCV")
	public List<ThequeCV> liste()
	{
		return cvRepository.findAll();
	}
}
