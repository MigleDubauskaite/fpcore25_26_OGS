package com.miempresa.coredam2optproyecto0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MiPrimerController {

	// la clase controller tiene una serie de métodos que se va a ejecutar a levantar el
	// servidor (mediante las rutas)
	
	@GetMapping("/mi-primer-weblink")
	public String miPrimerMetodoHandler() {
		return "mi-primera-vista";
	}

}
