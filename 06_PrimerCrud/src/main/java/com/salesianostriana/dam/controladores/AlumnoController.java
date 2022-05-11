package com.salesianostriana.dam.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.servicio.AlumnoServicio;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoServicio alumnoServicio;
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("lista", alumnoServicio.findAll());
		return "alumno/index";
	}
	
	

}
