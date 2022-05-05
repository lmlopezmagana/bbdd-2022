package com.salesianostriana.springboot;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ChiquitoDeLaCalzada {
	
	private List<String> chistes;
	
	
	public List<String> getChistes() {
		return chistes;
	}
	
	@PostConstruct
	public void init() {
		chistes = List.of(
				"El niño quiere ir al «Zoo»",
				"El burro anémico",
				"Bacalao con tomate",
				"Un concejal de Cuenca"
				);		
	}
	

}
