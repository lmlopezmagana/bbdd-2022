package com.salesianostriana.dam;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.modelo.Alumno;
import com.salesianostriana.dam.modelo.Curso;
import com.salesianostriana.dam.modelo.Profesor;
import com.salesianostriana.dam.repositorio.AlumnoRepository;
import com.salesianostriana.dam.repositorio.CursoRepository;
import com.salesianostriana.dam.repositorio.ProfesorRepository;

@Component
public class MainDeMentira {
	
	@Autowired
	private AlumnoRepository alumnoRepo;
	
	@Autowired
	private CursoRepository cursoRepo;
	
	@Autowired
	private ProfesorRepository profeRepo;
	
	@PostConstruct
	public void run() {
		
		
		Profesor p = Profesor.builder()
					.nombre("Miguel Campos")
					.build();
		
		profeRepo.save(p);
		
		
		Curso dam1 = Curso.builder()
				.nombre("1º DAM")
				//.tutor("Miguel Campos")
				.tutor(p)
				.build();
		
		cursoRepo.save(dam1);
		
		List<Alumno> alumnos =
				List.of(
						Alumno.builder()
						.nombre("David")
						.apellidos("García")
						.curso(dam1)
						.build(),
						Alumno.builder()
						.nombre("José Luis")
						.curso(dam1)
						.build()
						,
						Alumno.builder()
						.nombre("Pepe")
						.apellidos("Pérez")
						.curso(dam1)
						.build()
						);
		
		alumnoRepo.saveAll(alumnos);
		
		
		
		List<Alumno> result = alumnoRepo.findAll();
		
		result.forEach(System.out::println);
		
		
		
	}

}
