package com.bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.entity.Actor;

@Repository
public interface ActorDAO extends JpaRepository<Actor, Long> {
	
	Actor findByName(String name);
	
}