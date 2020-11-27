package fr.eni.tp.filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;


@Entity
public class User {
	
	@Id
	@Column(length = 50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(length = 50, nullable = false, unique = true)
	@NotBlank
	private String username;

	@Column(length = 500, nullable = false)
	@NotBlank
	private String password;

	@ManyToOne
	private Role role;
	
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name="user_id")
	private List<Opinion> opinions;
	
	
	public User() {
		
	}
	
	public User(String username) {
		this.username=username;
		this.opinions=new ArrayList<Opinion>();
	}
	
	public User(String username, String password) {
		this.username=username;
		this.password=password;
		this.opinions=new ArrayList<Opinion>();
	}
	
	public User(String username, String password, Role role) {
		this.username=username;
		this.password=password;
		this.role=role;
		this.opinions=new ArrayList<Opinion>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public void addOpinion(Opinion opinion) {
		opinions.add(opinion);
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
}
