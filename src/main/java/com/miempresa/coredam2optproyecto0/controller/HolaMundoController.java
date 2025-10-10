package com.miempresa.coredam2optproyecto0.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundoController {
	
	@GetMapping("/holamundo")
	public String m() {
		return "prueba";
	}

}
