package fr.eni.tp.filmotheque.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.tp.filmotheque.bo.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{
}
