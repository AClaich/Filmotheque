package fr.eni.tp.filmotheque.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.tp.filmotheque.bo.User;

public interface UserRepository extends CrudRepository<User, String> {

}
