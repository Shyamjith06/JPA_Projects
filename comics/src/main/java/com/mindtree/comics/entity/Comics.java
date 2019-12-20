package com.mindtree.comics.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Comics {
	@Id
	@Column(name="comics_id")
	private int comicsId;
	@Column(name="comics_name")
	private String comicsName;
	
	@OneToMany(mappedBy="comics", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("comics")
	private Set<SuperHero> superHeroes;
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
	
	public Set<SuperHero> getSuperHeroes() {
		return superHeroes;
	}
	public void setSuperHeroes(Set<SuperHero> superHeroes) {
		this.superHeroes = superHeroes;
	}
	public Comics() {
		super();
	}
	
	
}
