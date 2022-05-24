package com.webPlateformeOrientation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Entreprise extends User{
	public Entreprise(String nom, String addresseEmail, String password, String passwordCon) {
		super(nom, addresseEmail, password, passwordCon);
		// TODO Auto-generated constructor stub
	}
	@Column
	private String secteurActivite;
	@Column
	private String description;
	@Column
	private String region;
	@Column
	private String tel;
	@Column
	private String siteWeb;
//	@OneToMany(mappedBy = "entreprise")
//	public List<Offres> listeOffre = new ArrayList<Offres>();
	
}
