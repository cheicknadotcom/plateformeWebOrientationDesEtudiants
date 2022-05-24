package com.webPlateformeOrientation.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Offres {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String titre;
	@Column
	private String description;
	@Column
	private String diplome;
	@Column
	private String connaissanceTechnique;
	@Column
	private String region;
	@Column
	private Double salaire;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateoffre;
	@Column
	private String nomEntreprise;
//	@ManyToOne @JoinColumn
//    private Entreprise entreprise;
}
