package com.webPlateformeOrientation.Entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 @Entity
 @Getter @Setter
 @Data @NoArgsConstructor @ToString @AllArgsConstructor
public class Etudiant extends User{
	@Column
	private String matricule;
	@Column
	private String prenom;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateNaissance;
	@Column
	private String specialite;
	@Column	
	private String niveauEtude;
	@Column
	private String tel;
//	@OneToOne(cascade = CascadeType.ALL) @JoinColumn (name="fk_add_id")
//	private ThequeCV monCV;
	
	public Etudiant(String nom,String prenom,Date dateNaissances,String specialie,
			String conssaince,String niveau,String addresseEmail,String password,String passwordCont,String numTel,
			String nationalite) {
		super(nom,addresseEmail,password,passwordCont);
		this.prenom = prenom;
		this.dateNaissance = dateNaissances;
		this.specialite = specialie;
		this.niveauEtude = niveau;
	
		this.tel = numTel;
	
	}
}
