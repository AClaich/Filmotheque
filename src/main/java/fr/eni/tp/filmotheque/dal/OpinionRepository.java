package fr.eni.tp.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.tp.filmotheque.bo.Opinion;

public interface OpinionRepository extends JpaRepository<Opinion, Integer> {

}
