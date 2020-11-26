package fr.eni.tp.filmotheque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 50, nullable = false)
	private String title;
	
	@Column(length = 50, nullable = false)
	private int releaseYear;
	
	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Film(String title, int releaseYear) {
		this.title=title;
		this.releaseYear=releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
