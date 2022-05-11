package com.salesianostriana.dam.servicio;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Curso;
import com.salesianostriana.dam.repositorio.CursoRepository;
import com.salesianostriana.dam.servicio.base.ServicioBaseImpl;

@Service
public class CursoServicio 
		extends ServicioBaseImpl<Curso, Long, CursoRepository>{
	
	
	public List<Curso> listarPrimeros() {
		return this.repositorio.findAll()
				.stream()
				.filter(c -> c.getNombre().startsWith("1º"))
				.collect(Collectors.toList());
				
	}
	

}
