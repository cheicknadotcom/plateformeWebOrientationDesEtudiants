package com.webPlateformeOrientation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webPlateformeOrientation.Entity.Entreprise;
import com.webPlateformeOrientation.Repository.EntrepriseRepository;

@Service
public class EntrepriseService {
	private static List<Entreprise> listeEntreprise;
	@Autowired
	private static EntrepriseRepository entrepriseRepository;
	
	@SuppressWarnings("unused")
	public static  void creerEntreprise(Entreprise entreprise)
	{
		entrepriseRepository.save(entreprise);
	}
	public static Entreprise giveEntreprise(Long id,String nom)
	{
		listeEntreprise = entrepriseRepository.findAll();
		for(int i=0; i<= listeEntreprise.size(); i++)
		{
			if((listeEntreprise.get(i).getId().compareTo(id) == 0)&&(listeEntreprise.get(i).getNom().compareTo(nom) == 0))
			{
				return listeEntreprise.get(i);
			}
		}
		return null;
	}
}
 