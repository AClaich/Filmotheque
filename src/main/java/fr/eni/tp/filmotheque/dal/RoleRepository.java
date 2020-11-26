package fr.eni.tp.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tp.filmotheque.bo.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
