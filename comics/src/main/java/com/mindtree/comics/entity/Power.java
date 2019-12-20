package com.mindtree.comics.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Power {
	@Id
	@Column(name="power_id")
	private int powerId;
	@Column(name="power_name")
	private String powerName;
	@Column(name="power_damage")
	private String powerDamage;
	
	@ManyToOne
	@JsonIgnoreProperties("powers")
	private SuperHero superHero;

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

	public SuperHero getSuperHero() {
		return superHero;
	}

	public void setSuperHero(SuperHero superHero) {
		this.superHero = superHero;
	}

	public Power() {
		super();
	}
	

}
