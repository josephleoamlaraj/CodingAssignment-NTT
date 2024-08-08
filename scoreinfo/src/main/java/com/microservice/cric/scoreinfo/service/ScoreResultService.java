package com.microservice.cric.scoreinfo.service;

import java.util.List;

import com.microservice.cric.scoreinfo.entity.ScoreResult;

public interface ScoreResultService {

	// Save operation
	ScoreResult saveScoreResult(ScoreResult scoreResult);

    // Read operation
    List<ScoreResult> fetchScoreResultList();

    // Read operation
    ScoreResult fetchScoreResultById(Integer matchId);
    
    // Update operation
    ScoreResult updateScoreResult(ScoreResult scoreResult,
                                Integer matchId);

    // Delete operation
    void deleteScoreResultById(Integer matchId);
}
