package com.mindtree.comics.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class ComicsDto {
	
	private int comicsId;
	
	private String comicsName;
	
	
	@JsonIgnoreProperties("comics")
	private Set<SuperHeroDto> superHeroes;

	public ComicsDto() {
		super();
	}

	public int getComicsId() {
		return comicsId;
	}

	public void setComicsId(int comicsId) {
		this.comicsId = comicsId;
	}

	public String getComicsName() {
		return comicsName;
	}

	public void setComicsName(String comicsName) {
		this.comicsName = comicsName;
	}

	

	public Set<SuperHeroDto> getSuperHeroes() {
		return superHeroes;
	}

	public void setSuperHeroes(Set<SuperHeroDto> superHeroes) {
		this.superHeroes = superHeroes;
	}
	
	
}
