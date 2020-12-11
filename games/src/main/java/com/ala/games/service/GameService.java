package com.ala.games.service;

import java.util.List;

import com.ala.games.entities.Game;

public interface GameService {
	Game saveGame(Game g);
	Game updateGame(Game g);
	void deleteGame(Game g);
	 void deleteGameById(Long id);
	Game getGame(Long id);
	List<Game> getAllGames();
	}


