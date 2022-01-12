package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_score")
public class Score {

	@EmbeddedId
	private ScoreId id = new ScoreId();
	private Double score;
	
	public Score() {
		
	}

	public Score(ScoreId id, Double score) {
		this.id = id;
		this.score = score;
	}

	public ScoreId getId() {
		return id;
	}
	
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}

	public void setId(ScoreId id) {
		this.id = id;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}
	
}
