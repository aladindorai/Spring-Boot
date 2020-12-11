package com.ala.games.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ala.games.entities.Categorie;
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
	public Page<Game> getAllGamesParPage(int page, int size) {
	return gameRepository.findAll(PageRequest.of(page, size));
	}
	@Override
	public List<Game> findByNomGame(String nom) {
	return gameRepository.findByNomGame(nom);
	}
	@Override
	public List<Game> findByNomGameContains(String nom) {
	return gameRepository.findByNomGameContains(nom);
	}
	@Override
	public List<Game> findByNomPrix(String nom, Double prix) {
		return gameRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Game> findByCategorie(Categorie categorie) {
	return gameRepository.findByCategorie(categorie);
	}
	@Override
	public List<Game> findByCategorieIdCat(Long id) {
	return gameRepository.findByCategorieIdCat(id);
	}
	@Override
	public List<Game> findByOrderByNomGameAsc() {
	return gameRepository.findByOrderByNomGameAsc();
	}
	@Override
	public List<Game> trierGamesNomsPrix() {
	return gameRepository.trierGamesNomsPrix();
	}
	}


	

