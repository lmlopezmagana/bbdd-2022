package com.salesianostriana.springboot;


public class TrianeroSaludator implements Saludator {

	private String saludo;
	
	
	public TrianeroSaludator() {
		saludo = "EHHHHHHHHHH";
	}
	
	
	
	@Override
	public void setSaludo(String s) {
		saludo = s;
		
	}

	@Override
	public void printSaludo() {
		System.out.println(saludo);
		System.out.println("iyo iyo iyo iyo iyo");
	}

}
