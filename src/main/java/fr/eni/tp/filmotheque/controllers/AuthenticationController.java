package fr.eni.tp.filmotheque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.service.UserServices;

@Controller
@SessionAttributes({"userToken"})
public class AuthenticationController {

	private UserServices userService;
	
	public AuthenticationController(UserServices userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public User getAttributPerson() {
		return new User();
	}
	
	@ModelAttribute("userToken")
	public User getUserToken() {
		return new User();
	}
	
	@GetMapping("/authentication")
	public String getAuthentificationPage(@ModelAttribute User user) {
		return "authentication";
	}
	
	@PostMapping("/authentication")
	public String connexion(@ModelAttribute User user, Model model) {
		
		boolean userValid = userService.checkUser(user);
		System.out.println(userValid);
		
		if(userValid) {
			User userFromBd = userService.getUser(user);
			model.addAttribute("userToken", userFromBd);
			return "redirect:/accueil";
		}
		System.out.println("not good");
		return "authentication";
	}

}
