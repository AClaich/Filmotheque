package fr.eni.tp.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.service.UserServices;

@Controller
public class AuthenticationController {

	private UserServices userService;
	
	public AuthenticationController(UserServices userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public User getAttributPerson() {
		return new User();
	}
	
	@GetMapping("/authentication")
	public String getAuthentificationPage(@ModelAttribute User user) {
		return "authentication";
	}
	
	@PostMapping("/authentication")
	public String connexion() {
		return null;
	}

}
