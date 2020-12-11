package com.ala.games;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.ala.games.entities.Categorie;
import com.ala.games.entities.Game;
import com.ala.games.repos.GameRepository;
import com.ala.games.service.GameService;

@SpringBootTest
class GamesApplicationTests {
	

	@Autowired
	private GameRepository gameRepository;
	private GameService gameService;
	
	@Test
	public void testCreateGame() {
	Game game = new Game("GTA V",149.999,new Date());
	gameRepository.save(game);	 
	}
	@Test
	public void testFindGame()
	{
	Game g = gameRepository.findById(1L).get();
	System.out.println(g);
	}
	@Test
	public void testUpdateGame()
	{
	Game g = gameRepository.findById(1L).get();
	g.setPrixGame(1000.0);
	gameRepository.save(g);
	}
	@Test
	public void testDeleteGame()
	{
		gameRepository.deleteById(1L);;
		}

		@Test
		public void testListerTousGames()
		{
		List<Game> gms = gameRepository.findAll();
		for (Game g : gms)
		{
		System.out.println(g);
		}
		}

		
		


		
		@Test
		public void testFindByNomProduit()
		{
		List<Game> gms = gameRepository.findByNomGame("GTA");

		for (Game g : gms)
		{
		System.out.println(g);
		}

		}
		@Test
		public void testFindByNomGameContains1 ()
		{
		List<Game> gms=gameRepository.findByNomGameContains("GTA");

		for (Game g : gms)
		{
		System.out.println(g);
		} }
		
		@Test
		public void testfindByNomPrix()
		{
		List<Game> gms = gameRepository.findByNomPrix("GTA", 1000.0);
		for (Game g : gms)
		{
		System.out.println(g);
		}

		}
		
		
		@Test
		public void testfindByCategorie()
		{
		Categorie cat = new Categorie();
		cat.setIdCat(1L);
		List<Game> gms = gameRepository.findByCategorie(cat);
		for (Game g : gms)
		{
		System.out.println(g);
		}

		}
		
		
		@Test
		public void findByCategorieIdCat()
		{
		List<Game> gms = gameRepository.findByCategorieIdCat(1L);
		for (Game g : gms)
		{
		System.out.println(g);
		}

		}
		
		@Test
		public void testfindByOrderByNomProduitAsc()
		{
		List<Game> gms =

		gameRepository.findByOrderByNomGameAsc();
		for (Game g : gms)
		{
		System.out.println(g);
		}

		}
		
		@Test
		public void testTrierGamesNomsPrix()
		{
		List<Game> gms = gameRepository.trierGamesNomsPrix();
		for (Game g : gms)
		{
		System.out.println(g);
		}

		}

}
