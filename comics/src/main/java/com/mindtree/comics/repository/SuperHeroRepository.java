package com.mindtree.comics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.comics.entity.SuperHero;

public interface SuperHeroRepository extends JpaRepository<SuperHero, Integer>{

}
