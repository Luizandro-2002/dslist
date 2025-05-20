package com.cursospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
