package fr.eni.tp.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.SessionAttributes;


import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.service.FilmService;

@Controller
@SessionAttributes({"userToken"})
public class MainController {

	private FilmService service;

	public MainController(FilmService service) {
		this.service = service;
	}

	@ModelAttribute("film")
	public Film getAttributFilm() {
		return new Film();

	}

	
	@ModelAttribute("userToken")
	public User getUserToken() {
		return new User();
	}
	
	//Affichage de la liste des films sur la page d'accueil
	@GetMapping({"/accueil","","/"})
	public String listFilm(Model model, @ModelAttribute("userToken") User userToken) {
		model.addAttribute("listFilm", service.searchListFilm());
		return "index";
	}

}
