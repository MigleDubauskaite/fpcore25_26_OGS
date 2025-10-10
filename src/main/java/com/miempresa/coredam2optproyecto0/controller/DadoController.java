package com.miempresa.coredam2optproyecto0.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dados")
public class DadoController {
	
	@GetMapping("/lanzar-dado")
	public String dado(Model model) {
		
		Random random = new Random();
		
		int tirada = random.nextInt(1, 7);
		
		model.addAttribute("titulo", "Lanzamiento de un dado al azar");
		model.addAttribute("parrafo", "El valor de dado lanzado... ");
		model.addAttribute("tirada", tirada);
		
		return "/dado/dado";
	}

}
