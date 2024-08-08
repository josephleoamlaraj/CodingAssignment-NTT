package com.microservice.cric.scoreinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.cric.scoreinfo.entity.ScoreResult;
import com.microservice.cric.scoreinfo.service.ScoreResultService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/scoreinfo")
@Api(tags = "ScoreInfo")
public class ScoreinfoController {

	@Autowired 
	private ScoreResultService scoreResultService;

	/**
	 * Save ScoreResult while adding contents into InMemory DB - SCORE_RESULT table.
	 * @param scoreResult
	 * @return
	 */
    @PostMapping("/addscoreresult")
    @ApiOperation(value = "Add Cricket ScoreResult Info details.")
    public ScoreResult saveScoreResult(@RequestBody ScoreResult scoreResult)
    {
        return scoreResultService.saveScoreResult(scoreResult);
    }
    
    /**
     * Read all ScoreResults from InMemory DB - SCORE_RESULT table.
     * @return
     */
    @GetMapping("/getscoreresults")
    @ApiOperation(value = "Get Cricket Info ScoreResult(s) details.")
    public List<ScoreResult> fetchScoreResultList()
    {
        return scoreResultService.fetchScoreResultList();
    }
    
    /**
     * Read specific ScoreResult by matchId from InMemory DB - SCORE_RESULT table.
     * @param id
     * @return
     */
    @GetMapping("/getscoreresult/{id}")
    @ApiOperation(value = "Get Cricket Info ScoreResult(for matchId) details.")
    public ScoreResult fetchScoreResult(@PathVariable String id)
    {
        return scoreResultService.fetchScoreResultById(new Integer(id));
    }
    
    /**
     * Update specific ScoreResult by matchId in InMemory DB - SCORE_RESULT table.
     * @param scoreResult
     * @param matchId
     * @return
     */
    @PutMapping("/updatescoreresult/{id}")
    @ApiOperation(value = "Update Cricket Specific ScoreResult details.")
    public ScoreResult updateScoreResult(@RequestBody ScoreResult scoreResult,
                     @PathVariable("id") Integer matchId)
    {
        return scoreResultService.updateScoreResult(scoreResult, matchId);
    }

    /**
     * Delete specific ScoreResult by matchId in InMemory DB - SCORE_RESULT table.
     * @param matchId
     * @return
     */
    @DeleteMapping("/deletescoreresult/{id}")
    @ApiOperation(value = "Delete Cricket Specific ScoreResult details.")
    public String deleteScoreResultById(@PathVariable("id")
                                       Integer matchId)
    {
        scoreResultService.deleteScoreResultById(
        		matchId);
        return "Deleted the ScoreResult("+matchId+") Successfully";
    }

}