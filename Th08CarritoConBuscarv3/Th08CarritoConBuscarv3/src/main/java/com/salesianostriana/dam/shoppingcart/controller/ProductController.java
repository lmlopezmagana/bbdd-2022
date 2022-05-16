package com.salesianostriana.dam.shoppingcart.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.shoppingcart.formbeans.SearchBean;
import com.salesianostriana.dam.shoppingcart.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping({"/", "/list"})
	public String productList(Model model) {
		
		model.addAttribute("productos", productService.findAllProducts());

/*La siguiente línea viene del último método, 
 * que se dedica a buscar, para que este método, 
 * muestre también el listado de productos cuando se han buscado, 
 * añadimos al model el objeto tipo bean de búsqueda cuando se está 
 * buscando algún producto*/
		model.addAttribute("searchForm", new SearchBean());
		return "list";
	}
	

	
	/*Método para buscar productos*/
	
	@PostMapping("/search")
	  public String searchProducto(@ModelAttribute("searchForm") SearchBean searchBean,
			 Model model){
	  	model.addAttribute("productos", productService.findByNombre(searchBean.getSearch()));
	  
	  return "list";
	  }
	

}
