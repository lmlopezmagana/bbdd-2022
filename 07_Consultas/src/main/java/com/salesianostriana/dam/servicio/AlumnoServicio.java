package com.salesianostriana.dam.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Alumno;
import com.salesianostriana.dam.repositorio.AlumnoRepository;
import com.salesianostriana.dam.servicio.base.ServicioBaseImpl;

@Service
public class AlumnoServicio extends
		ServicioBaseImpl<Alumno, Long, AlumnoRepository>{

	
	public List<Alumno> buscarPorNombre(String cadena) {
		return repositorio.findByNombreContainsIgnoreCaseOrApellidosContainsIgnoreCase(cadena, cadena);
	}
	
	
}
