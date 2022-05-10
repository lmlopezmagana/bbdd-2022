package com.salesianostriana.dam.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
	
	@Id @GeneratedValue
	private long id;
	
	private String nombre;
	
	private int orden;
	
	//private String tutor;
	@OneToOne
	private Profesor tutor;

}
