package com.webPlateformeOrientation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="ThequeCV")
@Data @AllArgsConstructor @NoArgsConstructor
public class ThequeCV{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String diplome;
	@Column
	private String specialite;
	@Column
	private String experience;
	@Column
	private String connaissance;
	@Lob
	private byte[] fichier;
	@OneToOne
	@JoinColumn (name="fk_add_id")
	private Etudiant etudiant;
}
