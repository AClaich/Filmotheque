package fr.eni.tp.filmotheque.controllers.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class AuthentificationConfiguration extends WebSecurityConfigurerAdapter{

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.authorizeRequests()
//			.mvcMatchers("/").permitAll()
//			.anyRequest().authenticated();
//	}
}
