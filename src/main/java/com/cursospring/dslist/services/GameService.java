package com.cursospring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.dslist.dto.GameMinDTO;
import com.cursospring.dslist.entities.Game;
import com.cursospring.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		// OU var result =  .....
		List<Game> result = gameRepository.findAll();
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
