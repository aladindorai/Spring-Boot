package com.ala.games.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGame;
	private String nomGame;
	private Double prixGame;
	private Date dateCreation;
	@ManyToOne
	private Categorie categorie;
	
	public Game() {
			super();
	}
	
	public Game(String nomGame, Double prixGame, Date dateCreation) {
		super();
		this.nomGame = nomGame;
		this.prixGame = prixGame;
		this.dateCreation = dateCreation;
	}

	public Long getIdGame() {
		return idGame;
	}

	public void setIdGame(Long idGame) {
		this.idGame = idGame;
	}

	public String getNomGame() {
		return nomGame;
	}

	public void setNomGame(String nomGame) {
		this.nomGame = nomGame;
	}

	public Double getPrixGame() {
		return prixGame;
	}

	public void setPrixGame(Double prixGame) {
		this.prixGame = prixGame;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Game [idGame=" + idGame + ", nomGame=" + nomGame + ", prixGame=" + prixGame + ", dateCreation="
				+ dateCreation + "]";
	}
	
	
	
}

