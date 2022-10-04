package com.hmdb.hmdb;

import java.util.ArrayList;

public class Movie {

    public static ArrayList<Movie> movies = new ArrayList<>();

    static int count = 0; // 2 movies in the database

    public int id;
    public String title;
    public String description;
    public int releaseYear;

    static {
        new Movie(1, "Pulp Fiction", "A movie about a guy who kills people", 1994);
        new Movie(2, "The Hunger Games",
                "A movie about a televised competition in which two teenagers from each of the twelve Districts of Panem are chosen at random to fight to the death.",
                2012);
    }

    public Movie(int id, String title, String description, int releaseYear) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;

        movies.add(this);
    }

    public ArrayList<Actor> getActors() {
        ArrayList<Actor> actors = new ArrayList<>();
        for (Actor actor : Actor.actors) {
            if (actor.movieId == this.id) {
                actors.add(actor);
            }
        }
        return actors;
    }
}
