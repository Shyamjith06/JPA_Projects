package com.mindtree.comics.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class SuperHeroDto {
	private int superheroId;

	private String superheroName;
	@JsonIgnoreProperties("superHeroes")
	private ComicsDto comics;
	
	@JsonIgnoreProperties("superHero")
	private List<PowerDto> powers;


	public SuperHeroDto() {
		super();
	}


	public int getSuperheroId() {
		return superheroId;
	}


	public void setSuperheroId(int superheroId) {
		this.superheroId = superheroId;
	}


	public String getSuperheroName() {
		return superheroName;
	}


	public void setSuperheroName(String superheroName) {
		this.superheroName = superheroName;
	}


	public ComicsDto getComics() {
		return comics;
	}


	public void setComics(ComicsDto comics) {
		this.comics = comics;
	}


	public List<PowerDto> getPowers() {
		return powers;
	}


	public void setPowers(List<PowerDto> powers) {
		this.powers = powers;
	}
	
}