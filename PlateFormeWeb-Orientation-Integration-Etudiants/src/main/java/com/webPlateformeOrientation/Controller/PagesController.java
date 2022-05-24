package com.webPlateformeOrientation.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webPlateformeOrientation.Entity.Entreprise;
import com.webPlateformeOrientation.Entity.Etudiant;
import com.webPlateformeOrientation.Entity.Offres;
import com.webPlateformeOrientation.Entity.ThequeCV;
import com.webPlateformeOrientation.Entity.Universite;
import com.webPlateformeOrientation.Entity.User;
import com.webPlateformeOrientation.Repository.EntrepriseRepository;
import com.webPlateformeOrientation.Repository.EtudiantRepository;
import com.webPlateformeOrientation.Repository.OffresRepository;
import com.webPlateformeOrientation.Repository.ThequeCvRepository;
import com.webPlateformeOrientation.Repository.UniversiteRepository;
import com.webPlateformeOrientation.Repository.UserRepository;
import com.webPlateformeOrientation.service.UserService;

import lombok.Data;

@Controller
@Data
public class PagesController {
	   
		private List<Etudiant> etudiants = new ArrayList<>();
		@Autowired
		UserRepository userRepository;
		@Autowired
		EtudiantRepository etudiantRepository;
		@Autowired
		EntrepriseRepository entrepriseRepository;
		@Autowired
		UniversiteRepository universiteRepository;
		@Autowired
		UserService service;
		@Autowired
		ThequeCvRepository cvRepository;
		@Autowired
		OffresRepository offresRepository;
	
		
		private List<User> liste;
		private User users; 
		
		@PostMapping("/acceuils")
		public String pagesUser(@ModelAttribute("user") User user,Model model)
		{
			liste = userRepository.findByAddresseEmailAndPassword(user.getAddresseEmail(), user.getPassword());
			
			if(liste.size()==0) {
				return "acceuil";
			}
			
			users = liste.get(0);
			//System.err.println(users);
			
			if(users.getType().compareTo("Etudiant")==0)
			{
				model.addAttribute("user", users);
				return "EspaceEtudiant";
				
			}else if(users.getType().compareTo("Entreprise")==0)
			{
				model.addAttribute("user",users);
				return "EspaceEntreprise";
			}else if(users.getType().compareTo("Universite")==0)
			{
				model.addAttribute("user", users);
				return "EspaceUniversite";
			}else if(users.getType().compareTo("Administrateur")==0)
			{
				model.addAttribute("user", users);
				return "administrateur";
			}
			
			return "acceuil";
		}
		/***************************************************************************************/
		/* Liste Etudiant */
		@GetMapping("/listeEtudiantsShow")
		public String showListeEtudiant(Model model)
		{
			List<Etudiant> listeEtudiant = etudiantRepository.findAll();
			model.addAttribute("listeEtudiant", listeEtudiant);
			return "listeEtudiant";
		}
		/***************************************************************************************/
		/* Liste Entreprise */
		@GetMapping("/listeEntrepriseShow")
		public String showListeEntreprise(Model model)
		{
			List<Entreprise> listeEntreprise = entrepriseRepository.findAll();
			model.addAttribute("listeEntreprise", listeEntreprise);
			return "listeEntreprise";
		}
		/***************************************************************************************/
		/* Liste CV */
		@GetMapping("/listeCv")
		public String showListeCV(Model model)
		{
			List<ThequeCV> listecv = cvRepository.findAll();
			model.addAttribute("listecv", listecv);
			return "listeCv";
		}
		/***************************************************************************************/
		/* Liste des Offres */
		@GetMapping("/listeOffres")
		public String showListeoffres(Model model)
		{
			List<Offres> listeoffres = offresRepository.findAll();
			model.addAttribute("listeoffres", listeoffres);
			return "listeOffres";
		}
		/* Liste University */
		@GetMapping("/listeUniversiteShow")
		public String showListeUniversite(Model model)
		{
			List<Universite> listeUniversite = universiteRepository.findAll();
			model.addAttribute("listeUniversite", listeUniversite);
			return "listeUniversite";
		}
		@GetMapping("/administrateur")
		public String showAdministrateur(Model model)
		{
			model.addAttribute("pagesAdministrateur", "administrateur");
			return "administrateur";
		}
		/*########################################################################################*/
		@PostMapping("/")
		public String PostAuthentification(@ModelAttribute Etudiant newEtudiant)
		{
			
			etudiants.add(newEtudiant);
			return "redirect:from/student";
			
		}
		/*########################################################################################*/
		@GetMapping("/acceuil")
		public String showAccueil(Model model)
		{
			model.addAttribute("user", new User());
			return "acceuil";
		}
		@GetMapping("/db")
		public String acceuildb(Model model) {
			 model.addAttribute("activePages", "db");
			 return "db";
		}
		@GetMapping("/")
		public String acceuilAff(Model model) {
			 model.addAttribute("activePages", "AccueilPrincipal");
			 return "AccueilPrincipal";
		}
		@GetMapping("/FormulaireOffres")
		public String showOffres(Model model)
		{
			model.addAttribute("PagesOffres", "FormulaireOffres");
			return "FormulaireOffres";
		}
		@GetMapping("/propos")
		public String showApropos(Model model)
		{
			model.addAttribute("PagesApro", "propos");
			return "propos";
		}
		@GetMapping("/EspaceEtudiant")
		public String showEspaceEtudiant(Model model)
		{
			model.addAttribute("PagesEspaceEtudiant", "EspaceEtudiant");
			return "EspaceEtudiant";
		}
		@GetMapping("/EspaceEntreprise")
		public String showEspaceEntreprise(Model model)
		{
			model.addAttribute("PagesEspaceEntreprise", "EspaceEntreprise");
			return "EspaceEntreprise";
		}
		@GetMapping("/EspaceUniversite")
		public String showEspaceUniversite(Model model)
		{
			model.addAttribute("PagesEspaceUniversite", "EspaceUniversite");
			return "EspaceUniversite";
		}
		@GetMapping("/FormulaireOrientaion")
		public String showFormulaireOrientation(Model model)
		{
			model.addAttribute("PagesFormulaireOrientation", "FormulaireOrientation");
			return "FormulaireOrientation";
		}
		@GetMapping("/Contact")
		public String ShowContact(Model model)
		{
			model.addAttribute("PagesContact","Contact");
			return "Contact";
		}
		@GetMapping ("/infosEntreprise")
		public String showEntreprise(Model model)
		{
			model.addAttribute("PagesEntreprise", "infosEntreprise");
			return "infosEntreprise";
		}
		@GetMapping("/infosUniversite")
		public String showUniversite(Model model)
		{
			model.addAttribute("PagesUniversite","infosUniversite");
			return "infosUniversite";
		}
		@GetMapping("/Authentification")
		public String authentification(Model model)
		{
			model.addAttribute("PagesAuthentification", "Authentification");
			return "Authentification";
		}
		@GetMapping("/FormulaireCV")
		public String formulaireCV(Model model)
		{
			model.addAttribute("PagesCV", new Etudiant());
			return "FormulaireCV";
		}
		@GetMapping("/infoEtudiant")
		public String infoEntudiant(Model model)
		{
			model.addAttribute("PagesInfosEtudiant", "infoEtudiant");
			return "infoEtudiant";
		}
		@GetMapping("/formulaire/Entreprise")
		public String infoEnprise(Model model)
		{
			model.addAttribute("PagesInfoEntreprise", "infosEntreprise");
			return ("infosEntreprise");
		}
		@GetMapping("/FormulaireRecrutement")
		public String formulaireRecrutement(Model model) {
			model.addAttribute("PagesFormulaireRecrutement", "FormulaireRecrutement");
			return "FormulaireRecrutement";
		}
		@RequestMapping("/delete")
		public String delecteUser(@RequestParam("id") Long id,Model model )
		{
			try {
				userRepository.deleteById(id);
				
			}catch(Exception e)
			{}
			return "redirect:/listeEtudiantsShow";
		}
		@RequestMapping("/deletes")
		public String delecteUsers(@RequestParam("id") Long id,Model model )
		{
			try {
				userRepository.deleteById(id);
				
			}catch(Exception e)
			{
				
			}
			return "redirect:/listeEntrepriseShow";
		}
		@RequestMapping("/deletees")
		public String delecteUseres(@RequestParam("id") Long id,Model model )
		{
			try {
				userRepository.deleteById(id);	
			}catch(Exception e)
			{
				
			}
			return "redirect:/listeUniversiteShow";
		}
		@RequestMapping("/updateEtudiant")
		public String upDateUser(@RequestParam("id") Long id, Model model,@RequestParam("password") String password,@RequestParam("passwordConfirme") String passwordConfirme)
		{
			
			User user = userRepository.findByid(id);
			user.setPassword(password);
			user.setPasswordConfirme(passwordConfirme);
			model.addAttribute("update", user);
			userRepository.save(user);
			return "redirect:/listeEtudiantsShow";
		}
		@RequestMapping("/search")
		public String seachById(@RequestParam("addresseEmail") String email,Model model)
		{
			List<Etudiant> user = etudiantRepository.findByAddresseEmail(email);
			model.addAttribute("listeEtudiant", user);
			return "listeEtudiant";
		}
		@RequestMapping("/searchEntreprise")
		public String seachEntById(@RequestParam("addresseEmail") String email,Model model)
		{
			List<Entreprise> user = entrepriseRepository.findByAddresseEmail(email);
			model.addAttribute("listeEntreprise", user);
			return "listeEntreprise";
		}
		@RequestMapping("/searchUniversite")
		public String seachUniById(@RequestParam("addresseEmail") String email,Model model)
		{
			List<Universite> user = universiteRepository.findByAddresseEmail(email);
			model.addAttribute("listeUniversite", user);
			return "listeUniversite";
		}
		@RequestMapping("/updates")
		public String upDateUsers(@RequestParam("id") Long id, Model model)
		{
			User user = userRepository.findByid(id);
			model.addAttribute("update", user);
			return "infosEntreprise";
		}
		@RequestMapping("/updatesEtu")
		public String upDateUseres(@RequestParam("id") Long id, Model model)
		{
			User user = userRepository.findByid(id);
			model.addAttribute("update", user);
			return "infoEtudiants";
		}
		@RequestMapping("/updatees")
		public String upDateUserees(@RequestParam("id") Long id, Model model,@RequestParam("password") String password,@RequestParam("passwordConfirme") String passwordConfirme)
		{
			User user = userRepository.findByid(id);
			user.setPassword(password);
			user.setPasswordConfirme(passwordConfirme);
			model.addAttribute("update", user);
			return "infosUniversite";
		}
		@GetMapping("/listeEtudiants")
		public String listeEtudiants(Model model) {
			 model.addAttribute("activePages", "listeEtudiants");
			 return "listeEtudiants";
		}
		public void deleteUser(Long id)
		{
			userRepository.deleteById(id);
		}
		
		
}
