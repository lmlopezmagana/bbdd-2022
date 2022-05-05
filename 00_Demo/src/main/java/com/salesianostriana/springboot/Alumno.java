package com.salesianostriana.springboot;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Alumno {
	
	private Long id;
	
	private String nombre;
	private String apellidos;
	private String email;
	
	private Curso curso;
	
	private LocalDate fechaNacimiento;

}
