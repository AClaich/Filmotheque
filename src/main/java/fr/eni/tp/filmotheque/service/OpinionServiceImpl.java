package fr.eni.tp.filmotheque.service;

import org.springframework.stereotype.Service;

import fr.eni.tp.filmotheque.bo.Opinion;
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

}
