package fr.eni.tp.filmotheque.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.tp.filmotheque.bo.Film;

public interface FilmRepository extends CrudRepository<Film, Long>{

}
