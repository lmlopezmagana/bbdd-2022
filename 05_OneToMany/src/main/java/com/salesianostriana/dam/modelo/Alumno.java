package com.salesianostriana.dam.modelo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {
	
	@Id @GeneratedValue
	private long id;
	
	private String nombre;
	
	private String apellidos;
	
	private LocalDate fechaGraduacion;
	
	@ManyToOne
	private Curso curso;
	
	// MÉTODOS AUXILIARES O HELPERS
	
	public void addToCurso(Curso curso) {
		this.curso = curso;
		curso.getAlumnos().add(this);
	}
	
	public void removeFromCurso(Curso curso) {
		curso.getAlumnos().remove(this);
		this.curso = null;
	}
	

}
