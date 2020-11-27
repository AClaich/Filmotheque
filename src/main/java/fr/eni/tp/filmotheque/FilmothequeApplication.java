package fr.eni.tp.filmotheque;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;

import fr.eni.tp.filmotheque.dal.FilmRepository;
import fr.eni.tp.filmotheque.dal.OpinionRepository;
import fr.eni.tp.filmotheque.dal.RoleRepository;
import fr.eni.tp.filmotheque.dal.UserRepository;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class FilmothequeApplication {

//	private PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	public static void main(String[] args) {
		SpringApplication.run(FilmothequeApplication.class, args);
	}

	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer(){
		return factory -> factory.setContextPath("/filmotheque");
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository userRepository, RoleRepository roleRepository, OpinionRepository opinionRepository, FilmRepository filmRepository) {
		return (args) -> {
//			
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
//			
//
//			Film fightClub = new Film("Fight Club", 1999);
//			Film H2G2 = new Film("H2G2", 2005);
//			Film interstellar = new Film("Interstellar", 2014);
//			Film Parasite = new Film("Parasite", 2019);
//			Film pulpFiction = new Film("Pulp Fiction", 1994);
//			Film nidDeCoucou = new Film("Vol au dessus d\\'un nid de coucou", 1976);
//			
//			Opinion goodOpinion = new Opinion("Plutôt un bon film");
//			Opinion badOpinion = new Opinion("Vraiment naze");
//			Opinion boringOpinion = new Opinion("\r\n"
//					+ "\r\n"
//					+ "Tout a été déjà dit sur le film de David Fincher. Film culte pour les uns, film générationnel pour d'autres. Critique mercantile de la société de consommation pour certains, film d'homosexuels refoulés pour d'autres. Fight Club ne laisse pas indifférent. Avec ce sur consumérisme de la matière et de la publicité, le narrateur se rend compte qu'il se détache de cette pensée matérialiste environnante. Il se lève, mange, va au boulot, rentre chez lui, dort. Voici la routine qui l'accompagne jour et nuit dans l'ennui le plus total. Pour sortir de ce fardeau, il assistera à des thérapies de groupe pour tout un tas de maladie où il tombera sur la nébuleuse Marla. Tics clippesques un peu grossiers, voix off plombantes et redondantes, mouvements de caméra pas d'une grande subtilité, Fincher surligne son film assez vainement dans son premier tiers. Mais Fight Club cache bien son jeu et regorge d'une force de frappe qui va monter crescendo pour nous agripper dans cette descente dans la violence.\r\n"
//					+ "\r\n"
//					+ "Tout va basculer quand notre homme va faire la rencontre de Tyler Durdern. Beau, charismatique, manipulateur, taillé dans du marbre, il représente le mâle alpha dans toute sa splendeur. Avec sa présence, c'est notre homme et le film lui même qui va changer de cap. D'une critique faiblarde sur la société de consommation, Fight Club va s'imprégner d'une noirceur destructrice pour en devenir presque un pamphlet existentialiste à plusieurs niveaux de lectures. Pour changer de nature, pour se dévoiler, il faut détruire, perdre tout ce que l'on a et notamment le soi même. Les discussions entre les deux hommes se font de plus en plus nihilistes mais avec une pointe d'ironie qui permet au film de ne pas tomber dans le sérieux incontinent.\r\n"
//					+ "\r\n"
//					+ "C'est de là que va naître le Fight Club, société secrète avec ses propres règles et ses propres lois où des hommes venus d’ici et d'ailleurs vont pour pouvoir s'adonner au plaisir de la brutalité et du combat à main nue. En tant que réalisateur, Fincher filme avec brio cette violence jouissive pour en faire des petits moments de cinéma qui restent gravés à jamais sans qu'une parcelle de complaisance et de gratuité ne pointe le bout de son nez. Et au gré du film, la réalisation se fait plus mordante avec une lumière caverneuse qu'on avait déjà aperçue dans Seven et des plans de plus en plus classieux comme le prouve cette scène dantesque entre Edward Norton et Jared Leto où ce dernier prendra une raclée indicible.\r\n"
//					+ "\r\n"
//					+ "Mais cet esprit libre, cette envie de s’absoudre de ce conformisme va prendre une tangente plus radicale car derrière ce propos, il y a un projet, le projet chaos. Ces hommes vont devenir une sorte de milice terroriste avec des règles bien précises où l'on verra cohabiter un chef et ses sbires. Mais cette société n'est qu'une sorte de mirage, qu'une façade pour faire place à un autre niveau de lecture, celui de la construction et de l’identité d'un homme. Le narrateur va alors se voir dans le \"miroir\" et va comprendre qui il est et qui il n'est pas ou ne veut pas être. Sous ses airs de film culte un trop immédiat, se cache un film fastidieux et détonnant sur l'identité d'un homme et sur la construction de notre façon d’être. Porté par une direction d'acteurs irréprochable, une mise en scène stupéfiante quoique un peu lourdingue, Fight Club est le genre d'oeuvre peu commune hautement recommandable.\r\n");
//			
//			melanie.addOpinion(goodOpinion);
//			alexis.addOpinion(badOpinion);
//			user1.addOpinion(boringOpinion);
//
//			fightClub.addOpinion(goodOpinion);
//			fightClub.addOpinion(badOpinion);
//			fightClub.addOpinion(boringOpinion);
//			
//			// save a few users
//
//			filmRepository.save(fightClub);
//			filmRepository.save(H2G2);
//			filmRepository.save(interstellar);
//			filmRepository.save(Parasite);
//			filmRepository.save(pulpFiction);
//			filmRepository.save(nidDeCoucou);
//			
//
//			userRepository.save(alexis);
//			userRepository.save(melanie);
//			userRepository.save(user1);
		};
	}
}
