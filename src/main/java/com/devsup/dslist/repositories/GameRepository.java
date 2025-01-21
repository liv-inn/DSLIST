package com.devsup.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsup.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
