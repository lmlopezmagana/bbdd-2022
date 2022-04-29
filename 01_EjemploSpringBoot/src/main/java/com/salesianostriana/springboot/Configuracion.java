package com.salesianostriana.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Configuracion {
	
	
	@Bean
	@Primary
	public TrianeroSaludator trianeroSaludator() {
		return new TrianeroSaludator();
	}
	

}
