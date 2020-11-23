package fr.eni.tp.filmotheque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50, nullable = false)
	private String name;

	@Column(length = 50, nullable = false)
	private String firstname;
	
	@Column(length = 3, nullable = false)
	private int birthYear;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, String firstname, int birthYear) {
		this.name=name;
		this.firstname=firstname;
		this.birthYear=birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
	
}
