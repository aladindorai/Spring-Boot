package com.ala.games;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ala.games.entities.Game;
import com.ala.games.service.GameService;

@SpringBootApplication
public class GamesApplication implements CommandLineRunner {

	@Autowired
	GameService gameService;
	public static void main(String[] args) {
	SpringApplication.run(GamesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	gameService.saveGame(new Game("GTA 4", 247.25, new Date()));
	gameService.saveGame(new Game("League Of Legends", 958.36, new Date()));
	gameService.saveGame(new Game("Mobile Legends", 500.00, new Date()));

}
}
