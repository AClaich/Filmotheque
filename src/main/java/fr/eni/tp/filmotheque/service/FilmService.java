package fr.eni.tp.filmotheque.service;

import java.util.List;

import fr.eni.tp.filmotheque.bo.Film;

public interface FilmService {
	
	List<Film> searchListFilm();
	
	void addFilm(Film film);
	void deleteFilm(Long id);
	void modifyFilm(Film film);

}
