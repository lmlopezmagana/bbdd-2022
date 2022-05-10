package com.salesianostriana.dam.servicio.base;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class ServicioBaseImpl<T, ID, R extends JpaRepository<T, ID>> implements ServicioBase<T, ID> {

	@Autowired
	protected R repositorio;
	
	
	@Override
	public List<T> findAll() {
		return repositorio.findAll();
	}

	@Override
	public Optional<T> findById(ID id) {
		return repositorio.findById(id);
	}

	@Override
	public T save(T a) {
		return repositorio.save(a);
	}
	
	

	@Override
	public List<T> saveAll(List<T> list) {
		return repositorio.saveAll(list);
	}

	@Override
	public T edit(T a) {
		return save(a);
	}

	@Override
	public void delete(T a) {
		repositorio.delete(a);
	}

	@Override
	public void deleteById(ID id) {
		repositorio.deleteById(id);
	}

}
