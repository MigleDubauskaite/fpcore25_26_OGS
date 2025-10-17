package com.miempresa.coredam2optproyecto0.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miempresa.coredam2optproyecto0.model.Animal;

@Controller
@RequestMapping("/animales")
public class AnimalController {

	@Value("Animales")
	private String cabecera;

	@ModelAttribute(name = "cabecera")
	public String cabecera() {
		return "Animales";
	}

	@GetMapping("ungato")
	public String animales(Model model) {
		Animal gato = new Animal("gato", 3250, 250);
		// model.addAttribute("cabecera", nombrePagina);
		model.addAttribute("titulo", "Mostrando un gato");
		model.addAttribute("elGato", gato);
		return "/animal/un-gato";
	}

	@GetMapping("ningungato")
	public String ningunAnimal(Model model) {
		Animal gato1 = null;
		// model.addAttribute("cabecera", nombrePagina);
		model.addAttribute("titulo", "Mostrando un gato");
		model.addAttribute("elGato", gato1);
		return "/animal/un-gato";
	}

	// sacar una lista arraylist animales
	// for each con tabla

}
