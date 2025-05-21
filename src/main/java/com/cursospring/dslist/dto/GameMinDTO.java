package com.cursospring.dslist.dto;

import com.cursospring.dslist.entities.Game;
import com.cursospring.dslist.projections.GameMinProjection;

// ESSE ARQUIVO DTO É RESPONSÁVEL PELAS INFORMAÇÕES, TIPO AQUI VOCÊ DEFINE O QUE IRÁ APARECER NO FRONT-END
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	public GameMinDTO() {
		
	}
// AQUI, JÁ QUE JÁ ESTÁ CRIADA TODAS AS INFORMACÕES ABAIXO NA PASTA GAME, SO BASTA COLOCA-LOS EM AMBIGUIDADE (EX. THIS.TITLE...)
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
		}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	
}
