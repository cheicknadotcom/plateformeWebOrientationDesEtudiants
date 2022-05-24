package com.webPlateformeOrientation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.webPlateformeOrientation.Repository.RecrutementRepository;

@Controller
public class RecrutementControlleur {
	@Autowired
	RecrutementRepository recrutementRepository;
}
