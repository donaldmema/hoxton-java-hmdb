package com.hmdb.hmdb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hmdbRoutes {

    @GetMapping("/actor/{id}")
    public Actor getActor(@PathVariable Integer id) {
        Actor match = null;

        for (Actor actor : Actor.actors) {
            if (actor.id == id) {
                match = actor;
            }
        }

        if (match == null) {
            throw new RuntimeException("Actor not found");
        }

        return match;
    }

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable int id) {
        Movie match = null;

        for (Movie movie : Movie.movies) {
            if (movie.id == id) {
                match = movie;
            }
        }

        if (match == null) {
            throw new RuntimeException("Movie not found");
        }

        // match.getActors();

        return match;
    }

    @PostMapping("/actor")
    public Actor createActor(@RequestBody Actor actor) {
        return actor;
    }

    @PostMapping("/movie")
    public Movie createMovie(@RequestBody Movie movie) {
        return movie;
    }

}
