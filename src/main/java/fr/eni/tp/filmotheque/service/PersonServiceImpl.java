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
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person modifyPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

}
