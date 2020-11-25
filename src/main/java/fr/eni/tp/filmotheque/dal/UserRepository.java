package fr.eni.tp.filmotheque.dal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.eni.tp.filmotheque.bo.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value = "SELECT u FROM User u WHERE u.username = :username")
	public User findByUsername(@Param("username") String username);
}
