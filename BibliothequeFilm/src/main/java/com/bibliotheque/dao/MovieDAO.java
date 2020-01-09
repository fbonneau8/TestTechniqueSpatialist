package com.bibliotheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bibliotheque.entity.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Long> {
	Movie findByTitle(String title);

}