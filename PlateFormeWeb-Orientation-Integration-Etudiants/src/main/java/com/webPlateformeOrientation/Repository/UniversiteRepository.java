package com.webPlateformeOrientation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webPlateformeOrientation.Entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
	List<Universite> findByAddresseEmail(String email);
}
