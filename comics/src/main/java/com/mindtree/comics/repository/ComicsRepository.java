package com.mindtree.comics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.comics.entity.Comics;

public interface ComicsRepository extends JpaRepository<Comics, Integer>{

}
