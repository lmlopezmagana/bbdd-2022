package com.salesianostriana.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {
	
	
	@GetMapping("/")
	public String welcome() {
		return "index";
	}


	@GetMapping("/error")
	public String error() {
		return "error";
	}
	

}
