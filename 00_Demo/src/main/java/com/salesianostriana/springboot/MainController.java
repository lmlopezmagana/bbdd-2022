package com.salesianostriana.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
		
	@Autowired
	private SpanishSaludator saludator;
		
	@Autowired
	private ChiquitoDeLaCalzada chisteador;
	
	@GetMapping("/")
	public String saludar(Model model) {
		
		//model.addAttribute("saludo", "El clavel que me diste miarma lo tiré al pozo");
		saludator.setSaludo("Vaya caritas de no enteraros de nada que teneis");
		model.addAttribute("saludo", saludator.sayHello());
		
		return "index";
	}
	
	@GetMapping("/chistes")
	public String chistoso(Model model) {
		model.addAttribute("chistes", chisteador.getChistes());
		return "chistes";
	}

}
