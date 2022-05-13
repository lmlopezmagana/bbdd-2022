package com.salesianostriana.dam.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.modelo.Alumno;

public interface AlumnoRepository 
	extends JpaRepository<Alumno, Long> {
	
	
	// SELECT * FROM ALUMNO WHERE NOMBRE = ?
	List<Alumno> findByNombreContainsIgnoreCaseOrApellidosContainsIgnoreCase(String nombre, String apellidos);

}
