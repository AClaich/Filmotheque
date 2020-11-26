package fr.eni.tp.filmotheque.service;

import java.util.List;
//import java.util.List;
import java.util.Optional;


import fr.eni.tp.filmotheque.bo.Film;

public interface FilmService {
		
	void addFilm(Film film);
	
	List<Film> searchListFilm();
	
	void deleteFilm(Long nofilm);
	void modifyFilm(Film film);



	Optional<Film> searchFilm(Long nofilm);




}
