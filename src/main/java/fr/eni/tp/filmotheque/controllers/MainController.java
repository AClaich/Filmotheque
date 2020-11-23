package fr.eni.tp.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.tp.filmotheque.bo.Person;
import fr.eni.tp.filmotheque.service.PersonServices;

@Controller
public class MainController {
	
	private PersonServices personService;
	
	public MainController(PersonServices personServices) {
		this.personService = personServices;
	}
	
	@ModelAttribute("person")
	public Person getAttributPerson() {
		return new Person();
	}

	@GetMapping("/filmotheque")
	public String getAuthentificationPage() {
		return "index";
	}
	
	@GetMapping("/accueil")
	public String setPerson() {
		
		return "accueil";
	}
	
	@PostMapping("/ajout")
	public String addPerson(@ModelAttribute("person") Person person) {
		
		this.personService.addPerson(person);
		
		return "redirect:/accueil";
	}
}
