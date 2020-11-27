package fr.eni.tp.filmotheque.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Opinion;
import fr.eni.tp.filmotheque.bo.User;

public interface OpinionRepository extends JpaRepository<Opinion, Integer> {

	public List<Opinion> findAllByUser(User user);
	
	public List<Opinion> findAllByFilm(Film film);
}
