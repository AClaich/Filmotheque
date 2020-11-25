package fr.eni.tp.filmotheque.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tp.filmotheque.bo.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
}
