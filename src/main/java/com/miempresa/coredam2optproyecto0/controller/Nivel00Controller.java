package com.miempresa.coredam2optproyecto0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hola")
public class Nivel00Controller {
	
	@GetMapping({"nivel", "hola-mundo2"})
	public String m() {
		return "/hola_mundo/nivel";
	}
	
	@GetMapping({"nivel2", "hola-mundo-2"})
	public String holaMundo02(Model model) {
		model.addAttribute("title", "Hola Mundo 2");
		model.addAttribute("titular", "Hola Mundo 02👋🏼🤗💖");
		model.addAttribute("contenido", "Trabajando con interfaz Model");
		return "/hola_mundo/nivel2";
	}

}
