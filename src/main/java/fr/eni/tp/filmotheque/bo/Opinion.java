package fr.eni.tp.filmotheque.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Opinion {

	@Id
	@GeneratedValue
	public int id;
}
