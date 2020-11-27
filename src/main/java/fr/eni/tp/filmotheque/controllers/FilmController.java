package fr.eni.tp.filmotheque.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.service.FilmService;

@Controller
@SessionAttributes({"userToken"})
public class FilmController {
	
	////////////////////////////////////////////////////////////////////////////////////////
	//FILM - HOME PAGE
	////////////////////////////////////////////////////////////////////////////////////////
	
	private FilmService service;
	
	public FilmController(FilmService service) {
	this.service = service;
	}
	
	@ModelAttribute("film")
	public Film getAttributFilm() {
	return new Film();
	
	}

	

	
	@PostMapping("/add")
	public String saveFilm(@RequestParam("title") String newFilm) {
	
	Film film = new Film();
	film.setTitle(newFilm);
	if(film.getId()==null) {
		this.service.addFilm(film);
	}else {
		service.modifyFilm(film);
	}
	
	return "redirect:/accueil";
	}
	
	
	@GetMapping({ "/delete" })
	public String deleteFilm(@RequestParam("noFilm") Long noFilm) {
	
	service.deleteFilm(noFilm);
	
	return "redirect:/accueil";
	}
	
	@GetMapping({ "/modify" })
	public String modifyFilm(@RequestParam Long noFilm, Model model) {
	
	
	
	return "redirect:/accueil";
	
	}
	
	////////////////////////////////////////////////////////////////////////////////////////
	//FILM - MANAGEMENT PAGE
	////////////////////////////////////////////////////////////////////////////////////////
	
	@GetMapping({"/management"})
	public String filmManagement(Model model) {
	
	List<Film> listFilm = service.searchListFilm();
	model.addAttribute("listFilm", listFilm);
	//System.out.println(listFilm);
	return "filmFunctionality";
	
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////
	//FILM - DETAIL PAGE
	////////////////////////////////////////////////////////////////////////////////////////
	
	// Affichage de la liste des films sur la page d'accueil
	
	@GetMapping("/detail")
	public String detailFilm(Model model) {
	
	List<Film> listFilm = service.searchListFilm();
	model.addAttribute("listFilm", listFilm);
	
	return "detail";
	}

}
