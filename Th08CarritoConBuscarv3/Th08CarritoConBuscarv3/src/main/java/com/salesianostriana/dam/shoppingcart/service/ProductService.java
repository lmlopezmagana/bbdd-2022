package com.salesianostriana.dam.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.shoppingcart.model.Producto;
import com.salesianostriana.dam.shoppingcart.repository.ProductoRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductoRepository repository;
	
	public List<Producto> findAllProducts() {
		return repository.findAll();
	}
	
	public Producto findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public List<Producto> findByNombre(String nombre){
		return repository.findByNombreContainingIgnoreCase(nombre);
	}


	
	
}
