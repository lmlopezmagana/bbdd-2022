package com.salesianostriana.dam.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
	
	@OneToOne
	private Profesor tutor;
	
	
	@Builder.Default
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="curso", fetch = FetchType.EAGER)
	private List<Alumno> alumnos = new ArrayList<>();
	

}
