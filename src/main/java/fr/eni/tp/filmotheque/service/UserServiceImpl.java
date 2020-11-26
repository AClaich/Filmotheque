package fr.eni.tp.filmotheque.service;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.dal.UserRepository;

@Service
public class UserServiceImpl implements UserServices{

	private UserRepository userDAO;
	private PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
	
	public UserServiceImpl(UserRepository userDAO) {
		this.userDAO=userDAO;
	}
	
	@Override
	public User getUser(User user) throws Exception {
		return userDAO.findByUsername(user.getUsername());
	}

	@Override
	public void addUser(User user) {
		userDAO.save(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userDAO.delete(user);
	}

	@Override
	public void modifyUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkUser(User user) throws Exception {

		User userFromDB = getUser(user);

		return encoder.matches(user.getPassword(), userFromDB.getPassword());
	}
	
}
