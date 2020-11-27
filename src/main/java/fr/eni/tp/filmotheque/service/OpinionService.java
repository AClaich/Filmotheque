package fr.eni.tp.filmotheque.service;

import java.util.List;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Opinion;
import fr.eni.tp.filmotheque.bo.User;

public interface OpinionService {

	public void addOpinion(Opinion opinion);
	public void deleteOpinion(Opinion opinion);
	public List<Opinion> findAllOpinion();
	public List<Opinion> findAllOpinionByUser(User user);
	public List<Opinion> findAllOpinionByFilm(Film film);
	
}
