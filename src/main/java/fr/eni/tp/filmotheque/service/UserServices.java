package fr.eni.tp.filmotheque.service;

import java.util.Optional;

import fr.eni.tp.filmotheque.bo.User;

public interface UserServices {
	
	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public void modifyUser(User user);

	public Optional<User> getUser(User user);
}
