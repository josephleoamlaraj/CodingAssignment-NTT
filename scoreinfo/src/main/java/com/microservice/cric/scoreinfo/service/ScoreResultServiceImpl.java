package com.microservice.cric.scoreinfo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.cric.scoreinfo.entity.ScoreResult;
import com.microservice.cric.scoreinfo.repository.ScoreResultRepository;

//Annotation
@Service
public class ScoreResultServiceImpl implements ScoreResultService {

	@Autowired
	private ScoreResultRepository scoreResultRepository;

	@Override
	public ScoreResult saveScoreResult(ScoreResult scoreResult) {
		return scoreResultRepository.save(scoreResult);
	}

	@Override
	public List<ScoreResult> fetchScoreResultList() {
		return (List<ScoreResult>) scoreResultRepository.findAll();
	}
	
	@Override
	public ScoreResult fetchScoreResultById(Integer matchId) {
		ScoreResult scrResltDB = scoreResultRepository.findById(matchId).get();
		return scrResltDB; 
	}
	 
	@Override
	public ScoreResult updateScoreResult(ScoreResult scoreResult, Integer matchId) {
		ScoreResult scrResltDB = scoreResultRepository.findById(matchId).get();

		if (Objects.nonNull(scoreResult.getCountry1Name()) && !"".equalsIgnoreCase(scoreResult.getCountry1Name())) {
			scrResltDB.setCountry1Name(scoreResult.getCountry1Name());
		}

		if (Objects.nonNull(scoreResult.getCountry2Name()) && !"".equalsIgnoreCase(scoreResult.getCountry2Name())) {
			scrResltDB.setCountry2Name(scoreResult.getCountry2Name());
		}

		if (Objects.nonNull(scoreResult.getCountry1Score()) && !"".equalsIgnoreCase(scoreResult.getCountry1Score())) {
			scrResltDB.setCountry1Score(scoreResult.getCountry1Score());
		}

		if (Objects.nonNull(scoreResult.getCountry2Score()) && !"".equalsIgnoreCase(scoreResult.getCountry2Score())) {
			scrResltDB.setCountry2Score(scoreResult.getCountry2Score());
		}

		if (Objects.nonNull(scoreResult.getMatchDate()) && !"".equalsIgnoreCase(scoreResult.getMatchDate())) {
			scrResltDB.setMatchDate(scoreResult.getMatchDate());
		}
		
		if (Objects.nonNull(scoreResult.getPlace()) && !"".equalsIgnoreCase(scoreResult.getPlace())) {
			scrResltDB.setPlace(scoreResult.getPlace());
		}
		
		if (Objects.nonNull(scoreResult.getResult()) && !"".equalsIgnoreCase(scoreResult.getResult())) {
			scrResltDB.setResult(scoreResult.getResult());
		}
		
		return scoreResultRepository.save(scrResltDB);
	}

	@Override
	public void deleteScoreResultById(Integer matchId) {
		scoreResultRepository.deleteById(matchId);
	}
}
