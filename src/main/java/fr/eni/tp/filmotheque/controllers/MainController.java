package fr.eni.tp.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.tp.filmotheque.bo.Person;
import fr.eni.tp.filmotheque.bo.User;

@Controller
@SessionAttributes({"userToken"})
public class MainController {
	
	@ModelAttribute("person")
	public Person getAttributPerson() {
		return new Person();
	}
	
	@ModelAttribute("userToken")
	public User getUserToken() {
		return new User();
	}
	
	@GetMapping({"/accueil","","/"})
	public String getMainPage(@ModelAttribute("userToken") User userToken) {
		return "index";
	}
	
	@GetMapping("/monCompte")
	public String getMyAccountPage(@ModelAttribute("userToken") User userToken) {
		return "monCompte";
	}
}
