package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Film {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String title;
	
	@Column(length = 50, nullable = false)
	private int releaseYear;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER, orphanRemoval=true)
	@JoinColumn(name="film_id")
	private List<Opinion> opinions;
	
	public Film() {
		// TODO Auto-generated constructor stub
	}
	
	public Film(String title, int releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.opinions=new ArrayList<Opinion>();
	}
	
	public Film(String title, int releaseYear, Opinion opinion) {
		this.title = title;
		this.releaseYear = releaseYear;
		opinions=new ArrayList<Opinion>();
		opinions.add(opinion);
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public void addOpinion(Opinion opinion) {
		opinions.add(opinion);
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", title=" + title + ", releaseYear=" + releaseYear + "]";
	}


	
	
}
