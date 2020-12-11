package com.ala.games.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ala.games.entities.Game;
import com.ala.games.repos.GameRepository;

@Service
public class GameServiceImpl implements GameService{
	@Autowired
	GameRepository gameRepository;
	@Override
	public Game saveGame(Game g) {
	return gameRepository.save(g);
	}
	@Override
	public Game updateGame(Game g) {
	return gameRepository.save(g);
	}
	@Override
	public void deleteGame(Game g) {
	gameRepository.delete(g);
	}
	 @Override
	public void deleteGameById(Long id) {
	gameRepository.deleteById(id);
	}
	@Override
	public Game getGame(Long id) {
	return gameRepository.findById(id).get();
	}
	@Override
	public List<Game> getAllGames() {
	return gameRepository.findAll();
	}
}
	

