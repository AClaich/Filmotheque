package fr.eni.tp.filmotheque.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.service.FilmService;

@Controller
public class MainController {
	


	@GetMapping("/filmotheque")
	public String getAuthentificationPage() {
		return "index";
	}
	
////////////////////////////////////////////////////////////////////////////////////////
//                				 FILM
////////////////////////////////////////////////////////////////////////////////////////
	
	private FilmService service;
	
	public MainController(FilmService service) {
		this.service = service;
	}
	
	@ModelAttribute("film")
	public Film getAttributFilm() {
		return new Film();
		
	}
	
	//Affichage de la liste des films sur la page d'accueil
	@GetMapping("/home")
	public String listFilm(Model model) {
		
		model.addAttribute("listFilm", service.searchListFilm());
		
		return "index";
	}
	
	@PostMapping("/home")
	public String saveFilm(@ModelAttribute("film") Film film) {
        
		if(film.getId()==null) {
            this.service.addFilm(film);
        }else {
            service.modifyFilm(film);
        }

        return "redirect:/home";
	}
	
	
	@GetMapping({ "/delete"})
	public String deleteFilm(@RequestParam Long noFilm) {
		
		 service.deleteFilm(noFilm);
		
		 return "redirect:/home";
	}
	
	@GetMapping({ "/modify"})
	public String modifyFilm(@RequestParam Long noFilm, 
			Model model) {
		
		Optional<Film> filmOpt =  service.searchFilm(noFilm);
		model.addAttribute("film", filmOpt.get());
		model.addAttribute("listFilm", service.searchListFilm());
		
		 return "index";
	}

///////////////////////////////////////////////////////////////////////////////////////////
	
	
	/*
	 * 	private PersonServices personService;
	
	public MainController(PersonServices personServices) {
		this.personService = personServices;
	}
	
	@ModelAttribute("person")
	public Person getAttributPerson() {
		return new Person();
	}
	 * @PostMapping("/ajout")
	public String addPerson(@ModelAttribute("person") Person person) {
		
		this.personService.addPerson(person);
		
		return "redirect:/accueil";
	}*/
}
