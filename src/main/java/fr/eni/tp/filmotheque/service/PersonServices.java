package fr.eni.tp.filmotheque.service;

import fr.eni.tp.filmotheque.bo.Person;

public interface PersonServices {

	public void addPerson(Person person);
	
	public void deletePerson(Person person);
	
	public Person modifyPerson(Person person);
}
