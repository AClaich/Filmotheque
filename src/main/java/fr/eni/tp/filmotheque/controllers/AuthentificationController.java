package fr.eni.tp.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthentificationController{

	@GetMapping("/accueil")
	public String getAuthentificationPage() {
		return "index";
	}
	

}
