package com.salesianostriana.dam.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.security.Usuario;
import com.salesianostriana.dam.security.UsuarioRepo;

@Controller
public class AdminController {

	@Autowired
	private UsuarioRepo usuarioRepo;
	
    @GetMapping("/admin")
    public String adminIndex(Model model, @AuthenticationPrincipal UserDetails user) {
       
        //model.addAttribute("usuario", user.getUsername());
    	Optional<Usuario> elUsuario = usuarioRepo.findUserByUsername(user.getUsername());
    	// ESTO NO SE DEBE HACER ASÍ NUNCA. 
    	// ES SOLAMENTE POR MOTIVOS DIDÁCTICOS
    	//model.addAttribute("usuario", elUsuario.get());
        model.addAttribute("usuario", null);
        return "admin/index";
    }


}
