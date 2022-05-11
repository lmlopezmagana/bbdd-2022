package com.salesianostriana.dam.modelo;

import java.time.LocalDate;

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
public class Profesor {
	
	@Id @GeneratedValue
	private long id;
	
	private String nombre;
	
	private LocalDate fechaContratacion;
	
	

}
