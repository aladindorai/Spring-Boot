package com.ala.games.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ala.games.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	

}
