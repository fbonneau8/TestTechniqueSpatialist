package com.bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.entity.Director;

@Repository
public interface DirectorDAO extends JpaRepository<Director, Long> {
	
	Director findByName(String name);
		
}