package com.ala.games;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

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
		public void testFindByNomGameContains()
		{
		Page<Game> gms = gameService.getAllGamesParPage(0,2);
		System.out.println(gms.getSize());
		System.out.println(gms.getTotalElements());
		System.out.println(gms.getTotalPages());
		gms.getContent().forEach(p -> {System.out.println(p.toString());
		 });
		}

}
