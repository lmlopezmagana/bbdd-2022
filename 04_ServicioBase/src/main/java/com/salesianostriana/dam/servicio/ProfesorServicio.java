package com.salesianostriana.dam.servicio;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.modelo.Profesor;
import com.salesianostriana.dam.repositorio.ProfesorRepository;
import com.salesianostriana.dam.servicio.base.ServicioBaseImpl;

@Service
public class ProfesorServicio extends ServicioBaseImpl<Profesor, Long, ProfesorRepository>{

}
