package com.salesianostriana.dam;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {
	
	@Autowired
	private AlumnoRepository repo;
	
	@PostConstruct
	public void run() {
		
		/*
		Alumno a = new Alumno();
		a.setNombre("Luismi");
		a.setApellidos("López");
		*/
		
		Alumno a = Alumno.builder()
				.nombre("Luismi")
				.apellidos("López")
				.build();
		
		
		repo.save(a);
		
		
		
		List<Alumno> result = repo.findAll();
		
		result.forEach(System.out::println);
		
		
		
	}

}
