package com.miempresa.coredam2optproyecto0.controller;

import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dados")
public class DadoController {

	private static Random random = new Random();

	private int lanzarDado() {
		int tirada = random.nextInt(1, 7);
		return tirada;
	}

	@GetMapping("/lanzar-dado")
	public String dado(Model model) {
		model.addAttribute("titulo", "Lanzamiento de un dado al azar");
		model.addAttribute("parrafo", "El valor de dado lanzado... ");
		model.addAttribute("tirada", lanzarDado());

		return "/dado/mostrar-dados";
	}

	@GetMapping("/lanzar-dos-dados")
	public String dosDados(Model model) {

		model.addAttribute("titulo", "Lanzamiento de dos dados al azar");
		model.addAttribute("parrafo", "Los valor de los dados lanzados... ");
		model.addAttribute("coma", "-");
		model.addAttribute("tirada1", lanzarDado());
		model.addAttribute("tirada2", lanzarDado());
		return "/dado/mostrar-dados";
	}

}
