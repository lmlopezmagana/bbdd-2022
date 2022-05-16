package com.salesianostriana.dam.shoppingcart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.shoppingcart.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

		/**
	 * Método que devuelve una búsqueda realizada por nombre y le tenemos que pasar
	 * el atributo por el cual deseemos buscar, en nuestro caso, por nombre ignorando las mayúsculas
	 * @param nombre Nombre del producto registrado en nuestra base de datos
	 * @return devuelve el producto buscado por nombre
	 */
	public  List<Producto> findByNombreContainingIgnoreCase(String nombre);

}
