package fr.eni.tp.filmotheque.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.tp.filmotheque.bo.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

}
