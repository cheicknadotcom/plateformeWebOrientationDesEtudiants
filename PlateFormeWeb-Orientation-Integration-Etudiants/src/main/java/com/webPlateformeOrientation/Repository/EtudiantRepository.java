package com.webPlateformeOrientation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webPlateformeOrientation.Entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findByAddresseEmail(String email);
	//Etudiant findByAddresseEmail(String email);
}
