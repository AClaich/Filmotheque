package fr.eni.tp.filmotheque.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class User {
	
	@Id
	@Column(length = 50)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String username;
	
	@Column(length = 50, nullable = false)
	private String password;

	@OneToOne()
	private Role role;
	
	public User() {
		
	}
	
	public User(String username, String password, Role role) {
		this.username=username;
		this.password=password;
		this.role=role;
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
	
	
}
