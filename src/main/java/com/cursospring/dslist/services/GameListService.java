package com.cursospring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursospring.dslist.dto.GameListDTO;
import com.cursospring.dslist.entities.GameList;
import com.cursospring.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)	
	public List<GameListDTO> findAll(){
		// OU var result =  .....
		List<GameList> result = gameListRepository.findAll();
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
