package fr.eni.tp.filmotheque.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

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
	
	@GetMapping("/login")
	public String getAuthentificationPage(Model model) {
		model.addAttribute("user", new User());
		return "authentication";
	}
	
	@PostMapping("/connexion")
	public String connexion(@Valid @ModelAttribute User user, BindingResult result, Model model) throws Exception {

		if(result.hasErrors()) {
			return "authentication";
		}
		
		boolean userValid = false;
		try {
			userValid = userService.checkUser(user);
		} catch (Exception e) {
			model.addAttribute("userError", true);
			return "authentication";
		}
		
		if(userValid) {
			User userFromBd = userService.getUser(user);
			model.addAttribute("userToken", userFromBd);
			return "redirect:/accueil";
		}
		return "authentication";
	}
	
	@GetMapping("/logout")
	public String deconnexion(@ModelAttribute("userToken") User userToken, WebRequest request, SessionStatus status) {
		status.setComplete();
		request.removeAttribute("userToken", WebRequest.SCOPE_SESSION);

		return "redirect:/accueil";
	}

}
