package com.bibliotheque.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DIRECTOR")
public class Director {
	
	@Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;
	
	private String name;
	
	
	@OneToMany(targetEntity = Movie.class, mappedBy = "director", fetch = FetchType.EAGER)
	private List<Movie> movies;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
	
}
