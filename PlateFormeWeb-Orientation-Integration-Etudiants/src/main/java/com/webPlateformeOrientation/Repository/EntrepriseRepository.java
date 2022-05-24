package com.webPlateformeOrientation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webPlateformeOrientation.Entity.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
	List<Entreprise> findByAddresseEmail(String email);
}
