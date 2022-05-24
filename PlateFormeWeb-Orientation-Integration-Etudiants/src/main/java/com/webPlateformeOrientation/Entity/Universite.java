package com.webPlateformeOrientation.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString 
public class Universite extends User{

	@Column
	private String description;
	@Column 
	private String tel;
	@Column
	private String region;
	@Column
	private String siteWeb;
}
