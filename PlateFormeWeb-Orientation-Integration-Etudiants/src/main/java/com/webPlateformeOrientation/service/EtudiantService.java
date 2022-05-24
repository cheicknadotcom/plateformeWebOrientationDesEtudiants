package com.webPlateformeOrientation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webPlateformeOrientation.Entity.Etudiant;
import com.webPlateformeOrientation.Repository.EtudiantRepository;
@Service
public class EtudiantService {
	List<Etudiant> listEtudiant;
	private final EtudiantRepository etudiantRepository;
	
	public EtudiantService(EtudiantRepository etudiantRepository) {
		super();
		this.etudiantRepository = etudiantRepository;
	}
	public void create(Etudiant etudiant) {
		etudiantRepository.save(etudiant);
	}
	public void deleteById(Long id)
	{
		etudiantRepository.deleteById(id);
	}
	public void upDateEtudiant(Etudiant etudiant)
	{
		etudiantRepository.saveAndFlush(etudiant);
	}
	
	public Etudiant findeByEmailPassword(String email,String password)
	{
		Etudiant etud= etudiantRepository.findBy(null, null);
		return etud;
	}

}
