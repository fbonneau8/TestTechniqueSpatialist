package com.bibliotheque.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bibliotheque.dao.ActorDAO;
import com.bibliotheque.dao.DirectorDAO;
import com.bibliotheque.dao.MovieDAO;
import com.bibliotheque.entity.Actor;
import com.bibliotheque.entity.Director;
import com.bibliotheque.entity.Movie;

@RestController
@RequestMapping("/api/v1")
public class MainController {

	@Autowired
	private MovieDAO movieDAO;
	@Autowired
	private DirectorDAO directorDAO;
	@Autowired
	private ActorDAO actorDAO;

	@GetMapping("/moviesByDirector")
	public List<Movie> getMoviesByDirectorName(@RequestParam(value = "director") String directorName) {
		Director d = directorDAO.findByName(directorName);
		if (d == null) {
			return new ArrayList<Movie>();
		} else {
			return d.getMovies();
		}
	}

	@GetMapping("/moviesByActor")
	public List<Movie> getMoviesByActorName(@RequestParam(value = "actor") String actorName) {
		Actor a = actorDAO.findByName(actorName);
		if (a == null) {
			return new ArrayList<Movie>();
		} else {
			return a.getMovies();
		}
	}

	@GetMapping("/actorsByMovie")
	public List<Actor> getActorsByMovieTitle(@RequestParam(value = "movie") String movieTitle) {
		Movie m = movieDAO.findByTitle(movieTitle);
		if (m == null) {
			return new ArrayList<Actor>();
		} else {
			return m.getActors();
		}
	}

}