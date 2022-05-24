package com.webPlateformeOrientation.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webPlateformeOrientation.Entity.Etudiant;
import com.webPlateformeOrientation.Repository.EtudiantRepository;
@Controller
//@RequestMapping(path = "web/plateforme")
public class EtudiantController {
	//private List<Etudiant> etudiants = new ArrayList<>();
	//private EtudiantService etudiantService;
	@Autowired
	EtudiantRepository etudiantrepo;
	
	@RequestMapping("/etudiants")
	public String AjouterEtudiant()
	{
		return "infoEtudiant";
	}
	@RequestMapping("/saugardeEtudiant")
	public String dataSave(Etudiant etudiant)
	{
		
		etudiantrepo.save(etudiant);
		return "AccueilPrincipal";
	}
	@RequestMapping("/saugardeEtudiants")
	public String dataSaves(Etudiant etudiant)
	{
		Etudiant etu = etudiantrepo.findById(etudiant.getId()).get();
		if(etu.getType().compareTo(null) == 0) { 	 
		}
		etudiantrepo.save(etudiant);
		return "administrateur";
	}
//	public EtudiantController(EtudiantService etudiantService) {
//		this.etudiantService = etudiantService;
//	}
//	public EtudiantService getEtudiantService() {
//		return etudiantService;
//	}
//	@PostMapping("/infoEtudiant")
//	public String postStudent(Model model, @RequestBody Etudiant newEtudiant)
//	{
//		etudiantService.create(newEtudiant);
//		model.addAttribute("newEtudiants", newEtudiant);
//		return "redirect:/EspaceEtudiant";
//	}
//	@RequestMapping("/acceuil")
//	@ResponseBody
//	public String ajouterEtudiant(Etudiant etudiant)
//	{
//		etudiantService.create(etudiant);
//		return "acceuil";
//	}
//	@GetMapping("/from/student")
//	public String ShowStudent(Model model)
//	{
//		model.addAttribute("newEtudiant", new Etudiant());
//		return "infoEtudiant";
//	}
	@RequestMapping("/searchs")
	public String searchStudentsUnique(@RequestParam("addresse") String addresse,Model model)
	{
		//Etudiant student = etudiantrepo.findByAddresseEmail(addresse);
		//System.out.println(student);
		//model.addAttribute("listeEtudiant", student);
		return "listeEtudiant";
	}
}
