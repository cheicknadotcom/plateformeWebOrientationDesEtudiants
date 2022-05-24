package com.webPlateformeOrientation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webPlateformeOrientation.Entity.User;
import com.webPlateformeOrientation.Repository.UserRepository;
@Service
public class UserService{
	@SuppressWarnings("unused")
	private static List<User> listeUser;
	@Autowired
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String showInterface(String email,String password)
	{
		List<User> liste = userRepository.findByAddresseEmailAndPassword(email, password);
		User user = liste.get(0);
		System.err.println(user);
		if(user.getType().compareTo("Etudiant")==0)
		{
			return "EspaceEtudiant";
		}else if(user.getType().compareTo("Entreprise")==0)
		{
			return "EspaceEntreprise";
		}else if(user.getType().compareTo("Universite")==0)
		{
			return "EspaceUniversite";
		}
		
		return "acceuil";
	}
	
}
