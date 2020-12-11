package com.ala.games;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

import com.ala.games.entities.Game;
import com.ala.games.service.GameService;

@SpringBootApplication
public class GamesApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestMvcAutoConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
	SpringApplication.run(GamesApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Game.class);
	}

}

