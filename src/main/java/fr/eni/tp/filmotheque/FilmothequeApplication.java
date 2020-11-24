package fr.eni.tp.filmotheque;

import java.time.LocalDate;

import javax.management.relation.Role;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.dal.UserRepository;

@SpringBootApplication
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
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			
			// save a few customers
//			repository.save(new User("Alexis", "Alexis", new Role("Admin")));
//			repository.save(new User("Melanie", "Melanie", new Role("Admin")));
//			repository.save(new User("User1", "User1", new Role("User")));

			// fetch all customers
			// sysout //("Customers found with findAll():");
			System.out.println("Liste des personnes : ");
			System.out.println("-------------------------------");
			for (User user : repository.findAll()) {
				System.out.println(user.toString());
			}

		};
	}
}
