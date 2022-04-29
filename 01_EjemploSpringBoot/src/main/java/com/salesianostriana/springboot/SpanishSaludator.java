package com.salesianostriana.springboot;

import org.springframework.stereotype.Component;

@Component
public class SpanishSaludator implements Saludator {
	
	private String saludo;
	
	public SpanishSaludator() {
		saludo = "Hola tú";
	}
	
	@Override
	public void setSaludo(String s) {
		saludo = s;
		
	}

	@Override
	public void printSaludo() {
		System.out.println(saludo);
		
	}
	

}
