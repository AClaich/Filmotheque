package fr.eni.tp.filmotheque.service;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Person;
import fr.eni.tp.filmotheque.dal.PersonRepository;

@Service
public class PersonServiceImpl implements PersonServices{

	private PersonRepository personDAO;
	
	public PersonServiceImpl(PersonRepository personDAO) {
		this.personDAO = personDAO;
	}
	
	@Override
	public void addPerson(Person person) {
		personDAO.save(person);
	}

	@Override
	public void deletePerson(Person person) {
		personDAO.delete(person);
		
	}

	@Override
	public void modifyPerson(Person person) {
		personDAO.save(person);
	}

}
