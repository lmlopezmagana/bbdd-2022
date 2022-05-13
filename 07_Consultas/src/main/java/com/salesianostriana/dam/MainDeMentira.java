package com.salesianostriana.dam;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.modelo.Alumno;
import com.salesianostriana.dam.modelo.Curso;
import com.salesianostriana.dam.modelo.Profesor;
import com.salesianostriana.dam.servicio.AlumnoServicio;
import com.salesianostriana.dam.servicio.CursoServicio;
import com.salesianostriana.dam.servicio.ProfesorServicio;

@Component
public class MainDeMentira {
	
	@Autowired
	//private AlumnoRepository alumnoRepo;
	private AlumnoServicio alumnoServicio;
	
	
	@Autowired
	//private CursoRepository cursoRepo;
	private CursoServicio cursoServicio;
	
	@Autowired
	//private ProfesorRepository profeRepo;
	private ProfesorServicio profesorServicio;
	
	@PostConstruct
	public void run() {
		
		
		Profesor p = Profesor.builder()
					.nombre("Miguel Campos")
					.build();
		
		profesorServicio.save(p);
		
		
		Curso dam1 = Curso.builder()
				.nombre("1º DAM")
				//.tutor("Miguel Campos")
				.tutor(p)
				.build();
		
		cursoServicio.save(dam1);
		
		List<Alumno> alumnos =
				List.of(
						Alumno.builder()
						.nombre("David")
						.apellidos("García")
						.fechaGraduacion(LocalDate.of(2023, 6, 15))
						.build(),
						Alumno.builder()
						.nombre("José Luis")
						.apellidos("Hidalgo")
						.fechaGraduacion(LocalDate.of(2023, 6, 15))
						.build()
						,
						Alumno.builder()
						.nombre("Pepe")
						.apellidos("Pérez")
						.fechaGraduacion(LocalDate.of(2023, 6, 15))					
						.build()
						);
		
		for (Alumno a : alumnos) {
			a.addToCurso(dam1);
		}
		
		alumnoServicio.saveAll(alumnos);
		
		System.out.println(dam1);
		System.out.println(dam1.getAlumnos());
		
		List<Alumno> result = alumnoServicio.findAll();
		
		//result.forEach(System.out::println);
		
		
		
	}

}
