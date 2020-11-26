package fr.eni.tp.filmotheque.service;

import fr.eni.tp.filmotheque.bo.User;

public interface UserServices {
	
	public void addUser(User user);
	
	public void deleteUser(User user);
	
	public void modifyUser(User user);

	public User getUser(User user) throws Exception;
	
	public boolean checkUser(User user) throws Exception;
}
