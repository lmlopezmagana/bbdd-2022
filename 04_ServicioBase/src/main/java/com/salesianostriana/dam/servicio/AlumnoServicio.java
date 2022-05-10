package com.salesianostriana.dam.servicio;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Alumno;
import com.salesianostriana.dam.repositorio.AlumnoRepository;
import com.salesianostriana.dam.servicio.base.ServicioBaseImpl;

@Service
public class AlumnoServicio extends
		ServicioBaseImpl<Alumno, Long, AlumnoRepository>{

}
