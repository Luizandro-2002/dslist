package com.cursospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
