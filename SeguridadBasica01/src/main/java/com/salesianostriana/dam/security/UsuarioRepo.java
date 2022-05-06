package com.salesianostriana.dam.security;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepo {
	
	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return Collections.unmodifiableList(usuarios);
	}

	public Optional<Usuario> findUserByUsername(String username) {
		return usuarios.stream()
				.filter(u -> u.getUsername().equals(username))
				.findFirst();
	}
	
	@PostConstruct
	public void init() {
		usuarios = List.of(
				Usuario.builder()
					.username("luismi")
					.password("12345678")
					.role("ADMIN")
					.nombre("Luis Miguel")
					.apellidos("López Magaña")
					.fechaNacimiento(LocalDate.of(1982, 1, 1))
					.build()
				,
				Usuario.builder()
				.username("angel")
				.password("87654321")
				.role("USER")
				.nombre("Ángel")
				.apellidos("Naranjo González")
				.fechaNacimiento(LocalDate.of(1976, 1, 1))
				.build()
				
				
				);
				
	}
	
	

}
