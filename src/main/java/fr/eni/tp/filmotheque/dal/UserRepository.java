package fr.eni.tp.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.tp.filmotheque.bo.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByUsername(String username) throws Exception;
}
