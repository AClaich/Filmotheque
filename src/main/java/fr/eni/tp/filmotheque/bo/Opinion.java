package fr.eni.tp.filmotheque.bo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Opinion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 5000, nullable = false)
	private String sentence;
	
	@Column(nullable = false)
	private LocalDate dateCreation;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Film film;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private User user;
	
	public Opinion() {
		// TODO Auto-generated constructor stub
	}
	
	public Opinion(String sentence) {
		this.sentence = sentence;
		this.dateCreation = LocalDate.now();
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public LocalDate getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Opinion [id=" + id + ", sentence=" + sentence + ", dateCreation=" + dateCreation + ", film=" + film
				+ ", user=" + user + "]";
	}
	
	
}
