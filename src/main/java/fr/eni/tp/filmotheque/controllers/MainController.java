package fr.eni.tp.filmotheque.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.service.FilmService;

@Controller
@SessionAttributes({"userToken"})
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
	
	@ModelAttribute("userToken")
	public User getUserToken() {
		return new User();
	}
	
	//Affichage de la liste des films sur la page d'accueil
	@GetMapping("/accueil")
	public String listFilm(Model model, @ModelAttribute("userToken") User userToken) {
		
		model.addAttribute("listFilm", service.searchListFilm());
		
		return "index";
	}
	
	@PostMapping({"/accueil","","/"})
	public String saveFilm(@ModelAttribute("film") Film film) {
        
		if(film.getId()==null) {
            this.service.addFilm(film);
        }else {
            service.modifyFilm(film);
        }

        return "redirect:/accueil";
	}
	
	
	@GetMapping({ "/delete"})
	public String deleteFilm(@RequestParam Long noFilm) {
		
		 service.deleteFilm(noFilm);
		
		 return "redirect:/accueil";
	}
	
	@GetMapping({ "/modify"})
	public String modifyFilm(@RequestParam Long noFilm, 
			Model model) {
		
		Optional<Film> filmOpt =  service.searchFilm(noFilm);
		model.addAttribute("film", filmOpt.get());
		model.addAttribute("listFilm", service.searchListFilm());
		
		 return "index";
	}
}
