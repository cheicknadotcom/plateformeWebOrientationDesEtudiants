package com.webPlateformeOrientation.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name="T_utilisateur")
@Data @AllArgsConstructor @NoArgsConstructor @ToString 
public class User {
	//Les attributs d'instances de la classe user
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	@Column
	protected String nom;
//	@Column
	protected String type;
	@Column
	private String adresse;
	@Column
	protected String addresseEmail;
	@Column
	protected String password;
	@Column
	private String passwordConfirme;
	public User(String nom, String addresseEmail, String password,String passwordCon) {
		this.nom = nom;
		this.addresseEmail = addresseEmail;
		this.password = password;
		this.passwordConfirme = passwordCon;
	}
}
