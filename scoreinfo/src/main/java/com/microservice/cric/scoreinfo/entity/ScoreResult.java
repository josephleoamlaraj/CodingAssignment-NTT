package com.microservice.cric.scoreinfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ScoreResult {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer matchId;
	private String country1Name;
	private String country1Score;
	private String country2Name;
	private String country2Score;
	private String place;
	private String matchDate;
	private String result;

	public Integer getMatchId() {
		return matchId;
	}

	public void setMatchId(Integer matchId) {
		this.matchId = matchId;
	}

	public String getCountry1Name() {
		return country1Name;
	}

	public void setCountry1Name(String country1Name) {
		this.country1Name = country1Name;
	}

	public String getCountry1Score() {
		return country1Score;
	}

	public void setCountry1Score(String country1Score) {
		this.country1Score = country1Score;
	}

	public String getCountry2Name() {
		return country2Name;
	}

	public void setCountry2Name(String country2Name) {
		this.country2Name = country2Name;
	}

	public String getCountry2Score() {
		return country2Score;
	}

	public void setCountry2Score(String country2Score) {
		this.country2Score = country2Score;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
