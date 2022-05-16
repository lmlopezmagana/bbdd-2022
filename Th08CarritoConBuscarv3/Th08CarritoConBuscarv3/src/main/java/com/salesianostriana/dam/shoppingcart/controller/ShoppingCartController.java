package com.salesianostriana.dam.shoppingcart.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.salesianostriana.dam.shoppingcart.model.Producto;
import com.salesianostriana.dam.shoppingcart.service.ProductService;
import com.salesianostriana.dam.shoppingcart.service.ShoppingCartService;

@Controller
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@Autowired
	private ProductService productoService;
	
    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService, ProductService productService) {
        this.shoppingCartService = shoppingCartService;
        this.productoService = productService;
    }
    
    @GetMapping ("/carrito")
    public String showCarrito (Model model) {
    	
    	if (model.addAttribute("products",shoppingCartService.getProductsInCart()) == null)
    		return "redirect:/";
    	return "cart";
    }

    @GetMapping ("/productoACarrito/{id}")
    public String productoACarrito (@PathVariable("id") Long id, Model model) {
    	
    	shoppingCartService.addProducto(productoService.findById(id));
    	    		 	
    	return "redirect:/carrito";
    }
    
    @GetMapping("/borrarProducto/{id}")
    public String removeProductFromCart(@PathVariable("id") Long id) {
        
    	shoppingCartService.removeProducto(productoService.findById(id));
        return "redirect:/carrito";
    }
    
    @ModelAttribute("total_carrito")
    public Double totalCarrito () {
    	
    	Map <Producto,Integer> carrito=shoppingCartService.getProductsInCart();
    	double total=0.0;
    	if (carrito !=null) {
        	for (Producto p: carrito.keySet()) {
        		total+=p.getPvp()*carrito.get(p);
        	}
        	return total;
    	}
    	
    	return 0.0;
    }
}
