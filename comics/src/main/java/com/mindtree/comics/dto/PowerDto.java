package com.mindtree.comics.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class PowerDto {

	private int powerId;
	
	private String powerName;
	
	private String powerDamage;
	@JsonIgnoreProperties("powers")
	private SuperHeroDto superHeroDto;

	public PowerDto() {
		super();
	}

	public int getPowerId() {
		return powerId;
	}

	public void setPowerId(int powerId) {
		this.powerId = powerId;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public String getPowerDamage() {
		return powerDamage;
	}

	public void setPowerDamage(String powerDamage) {
		this.powerDamage = powerDamage;
	}

	public SuperHeroDto getSuperHero() {
		return superHeroDto;
	}

	public void setSuperHero(SuperHeroDto superHero) {
		this.superHeroDto = superHero;
	}
	
}
