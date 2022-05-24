package com.webPlateformeOrientation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@ComponentScan({"com.webPlateformeOrientation.request"})
@EntityScan("com.webPlateformeOrientation.domain")
@EnableJpaRepositories("com.webPlateformeOrientation.Repository")*/
@SpringBootApplication
public class PlateFormeWebOrientationIntegrationEtudiantsApplication {
	//@Autowired
	//private EtudiantRepository etudiant;
	public static void main(String[] args) {
		SpringApplication.run(PlateFormeWebOrientationIntegrationEtudiantsApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		System.out.println("###############################################################");
		etudiant.save(new Etudiant(1L,"Cheickna","cheicknadoumbia100@gmail.com","cheicknadoum1"));
		
	}*/

}
