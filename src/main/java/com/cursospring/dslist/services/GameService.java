package com.cursospring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cursospring.dslist.dto.GameDTO;
import com.cursospring.dslist.dto.GameMinDTO;
import com.cursospring.dslist.entities.Game;
import com.cursospring.dslist.projections.GameMinProjection;
import com.cursospring.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)	
	public GameDTO findById(Long id) {
		Game result  = gameRepository.findById(id).get();
		return  new GameDTO(result);
	}
	@Transactional(readOnly = true)	
	public List<GameMinDTO> findAll(){
		// OU var result =  .....
		List<Game> result = gameRepository.findAll();
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	@Transactional(readOnly = true)	
	public List<GameMinDTO> findByList(Long listId){
		// OU var result =  .....
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
