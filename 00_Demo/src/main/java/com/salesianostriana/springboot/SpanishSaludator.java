package com.salesianostriana.springboot;

import org.springframework.stereotype.Service;

@Service
public class SpanishSaludator {
	
	
	private String saludo;
	
	public SpanishSaludator() {
		saludo = "Hola Mundo";
	}
	
	public String sayHello( ) {
		return saludo;
	}
	
	public void setSaludo(String s) {
		saludo = s;
	}
	
	public void printSaludo() {
		System.out.println(saludo);
	}
	
	

}
