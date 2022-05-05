package com.salesianostriana.springboot;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Curso {
	
	private Long id;
	
	private String nombre;
	private String tutor;
	
	private List<Alumno> alumno;
	

}
