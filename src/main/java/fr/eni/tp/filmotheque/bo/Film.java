package fr.eni.tp.filmotheque.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue
	public int id;
}
