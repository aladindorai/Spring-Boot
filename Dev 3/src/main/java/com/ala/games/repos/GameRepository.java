package com.ala.games.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ala.games.entities.Categorie;
import com.ala.games.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	List<Game> findByNomGame(String nom);
	List<Game> findByNomGameContains(String nom);
	@Query("select g from game g where g.nomGame like %?1 and p.prixGame > ?2")
	List<Game> findByNomGame (String nom, Double prix);
	@Query("select g from Game g where g.nomGame like %:nom and g.prixGame > :prix")
	List<Game> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	@Query("select g from Game g where g.categorie = ?1")
	List<Game> findByCategorie (Categorie categorie);
	List<Game> findByCategorieIdCat(Long id);
	List<Game> findByOrderByNomGameAsc();
	@Query("select g from Game g order by g.nomGame ASC, p.prixGame DESC")
	List<Game> trierGamesNomsPrix ();
}
