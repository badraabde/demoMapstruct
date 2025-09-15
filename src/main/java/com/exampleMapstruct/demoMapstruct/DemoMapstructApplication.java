package com.exampleMapstruct.demoMapstruct;

import com.exampleMapstruct.demoMapstruct.model.Adresse;
import com.exampleMapstruct.demoMapstruct.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class DemoMapstructApplication {
	public static void main(String[] args) {

		SpringApplication.run(DemoMapstructApplication.class, args);

		User p = new User();
		p.setName("Alice Dupont");
		p.setEmail("alice@example.com");

		Adresse adr = new Adresse();
		adr.setRue("12 rue de la Paix");
		adr.setVille("Paris");
		adr.setCodePostal("75000");

		p.setAdresse(adr);


	}

}
