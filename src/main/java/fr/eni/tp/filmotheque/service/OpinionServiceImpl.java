package fr.eni.tp.filmotheque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Film;
import fr.eni.tp.filmotheque.bo.Opinion;
import fr.eni.tp.filmotheque.bo.User;
import fr.eni.tp.filmotheque.dal.OpinionRepository;

@Service
public class OpinionServiceImpl implements OpinionService{

	private OpinionRepository opinionDAO;
	
	public OpinionServiceImpl(OpinionRepository opinionDAO) {
		this.opinionDAO= opinionDAO;
	}
	
	@Override
	public void addOpinion(Opinion opinion) {
		opinionDAO.save(opinion);
	}

	@Override
	public void deleteOpinion(Opinion opinion) {
		opinionDAO.deleteById(opinion.getId());
		
	}

	@Override
	public List<Opinion> findAllOpinion() {
		return opinionDAO.findAll();
	}

	@Override
	public List<Opinion> findAllOpinionByUser(User user) {
		return opinionDAO.findAllByUser(user);
	}

	@Override
	public List<Opinion> findAllOpinionByFilm(Film film) {
		return opinionDAO.findAllByFilm(film);
	}

}
