package com.salesianostriana.dam.controladores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.modelo.Alumno;
import com.salesianostriana.dam.servicio.AlumnoServicio;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@Autowired
	private AlumnoServicio alumnoServicio;
	
	@GetMapping("/")
	public String list(Model model) {
		model.addAttribute("lista", alumnoServicio.findAll());
		return "alumno/index";
	}
	
	@GetMapping("/buscar")
	public String buscar(Model model, @RequestParam String nombre) {
		model.addAttribute("lista", alumnoServicio.buscarPorNombre(nombre));
		return "alumno/index";
	}
	
	@GetMapping("/detalle/{id}")
	public String detail(Model model, @PathVariable Long id) {
		
		Optional<Alumno> result = alumnoServicio.findById(id);
		
		if (result.isPresent()) {
			model.addAttribute("alumno", result.get());
			return "alumno/detail";			
		} else {
			return "redirect:/alumno/";
		}
		
	}
	
	@GetMapping("/nuevo")
	public String showForm(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "alumno/nuevo";
	}
	
	@PostMapping("/nuevo/submit")
	public String saveAlumno(@ModelAttribute("alumno") Alumno nuevo) {
		alumnoServicio.save(nuevo);
		return "redirect:/alumno/";
	}
	
	
	

}
