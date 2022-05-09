package com.salesianostriana.dam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
	

}
