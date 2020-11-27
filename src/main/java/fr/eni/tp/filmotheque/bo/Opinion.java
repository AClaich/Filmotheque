package fr.eni.tp.filmotheque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Opinion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 5000, nullable = false)
	private String sentence;
	
	public Opinion() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Opinion(String sentence) {
		this.sentence = sentence;
	}
	
	public Opinion(String sentence, Film film, User user) {
		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Opinion [id=" + id + ", sentence=" + sentence + ", dateCreation=" + "]";
	}
	
	
}
