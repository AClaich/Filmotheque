package fr.eni.tp.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tp.filmotheque.bo.Person;


public interface PersonRepository extends JpaRepository<Person, Integer>{
}
