package com.mindtree.comics.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
public class SuperHero {
	@Id
	@Column(name="superhero_id")
	private int superheroId;
	@Column(name="superhero_name")
	private String superheroName;
	@ManyToOne
	@JsonIgnoreProperties("superHeroes")
	private Comics comics;
	
	@OneToMany(mappedBy="superHero",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("superHero")
	private List<Power> powers;

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

	public Comics getComics() {
		return comics;
	}

	public void setComics(Comics comics) {
		this.comics = comics;
	}

	public List<Power> getPowers() {
		return powers;
	}

	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}

	public SuperHero() {
		super();
	}
	
}
