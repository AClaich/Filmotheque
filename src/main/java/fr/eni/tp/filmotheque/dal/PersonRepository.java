package fr.eni.tp.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tp.filmotheque.bo.Person;


public interface PersonRepository extends JpaRepository<Person, Integer>{
}
