package fr.eni.tp.filmotheque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import fr.eni.tp.filmotheque.bo.Role;
import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.dal.RoleRepository;
import fr.eni.tp.filmotheque.dal.UserRepository;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FilmothequeApplication {

	private PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	public static void main(String[] args) {
		SpringApplication.run(FilmothequeApplication.class, args);
	}

	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer(){
		return factory -> factory.setContextPath("/filmotheque");
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository userRepository, RoleRepository roleRepository) {
		return (args) -> {
			
//			Role admin = new Role("Admin");
//			Role user = new Role("User");
//			
//			roleRepository.save(admin);
//			roleRepository.save(user);
//			
//			User alexis = new User("Alexis", encoder.encode("Alexis"), user);
//			User melanie = new User("Melanie", encoder.encode("Melanie"), admin);
//			User user1 = new User("User1", encoder.encode("User1"), user);
//			
//			alexis.setRole(admin);
//			// save a few users
//			userRepository.save(alexis);
//			userRepository.save(melanie);
//			userRepository.save(user1);
		};
	}
}
