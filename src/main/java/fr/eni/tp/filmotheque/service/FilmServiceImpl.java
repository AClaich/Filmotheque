package fr.eni.tp.filmotheque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.dal.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService{
	
	private FilmRepository filmDAO;
	
	public FilmServiceImpl(FilmRepository filmDAO) {
		this.filmDAO = filmDAO;
	}

	@Override
	public void addFilm(Film film) {
		filmDAO.save(film);
	}
	
	@Override
	public void deleteFilm(Long nofilm) {
		filmDAO.deleteById(nofilm);
	}
	
	@Override
	public void modifyFilm(Film film) {
		filmDAO.save(film);
	}

	@Override
	public List<Film> searchListFilm(){
		return (List<Film>)filmDAO.findAll()
;	}
	
	@Override
	public Optional<Film> searchFilm(Long noFilm) {
		
		return filmDAO.findById(noFilm);
	}
	
	
}
