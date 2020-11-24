package fr.eni.tp.filmotheque.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.dal.UserRepository;

@Service
public class UserServiceImpl implements UserServices{

	private UserRepository userDAO;
	
	public UserServiceImpl(UserRepository userDAO) {
		this.userDAO=userDAO;
	}
	
	@Override
	public Optional<User> getUser(User user) {
		return userDAO.findById(user.getUsername());
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		
	}
	
}
