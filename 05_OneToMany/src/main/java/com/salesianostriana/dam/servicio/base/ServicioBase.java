package com.salesianostriana.dam.servicio.base;

import java.util.List;
import java.util.Optional;

public interface ServicioBase<T, ID> {
	
	
	public List<T> findAll();
	
	public Optional<T> findById(ID id);
	
	public T save(T a);
	
	public List<T> saveAll(List<T> list);
	
	public T edit(T a);
	
	public void delete(T a);
	
	public void deleteById(ID id);
	

}
