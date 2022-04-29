package com.salesianostriana.springboot;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	
	@Autowired
	// @Qualifier("spanishSaludator")
	private Saludator saludator;
	
	@PostConstruct
	public void init() {
		//saludator.setSaludo("Hola Mundo");
		saludator.printSaludo();
	}
	

}
