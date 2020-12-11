package com.ala.games.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.ala.games.entities.Categorie;
import com.ala.games.entities.Game;

public interface GameService {
	Game saveGame(Game g);
	Game updateGame(Game g);
	void deleteGame(Game g);
	 void deleteGameById(Long id);
	Game getGame(Long id);
	Page<Game> getAllGamesParPage(int page, int size);
	List<Game> getAllGames();
	List<Game> findByNomGame(String nom);
	List<Game> findByNomGameContains(String nom);
	List<Game> findByNomPrix (String nom, Double prix);
	List<Game> findByCategorie (Categorie categorie);
	List<Game> findByCategorieIdCat(Long id);
	List<Game> findByOrderByNomGameAsc();
	List<Game> trierGamesNomsPrix();
	}
	

	


