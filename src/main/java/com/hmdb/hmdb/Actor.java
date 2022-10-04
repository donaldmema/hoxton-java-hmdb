package com.hmdb.hmdb;

import java.util.ArrayList;

public class Actor {

  public static ArrayList<Actor> actors = new ArrayList<>();

  static int count = 0; // 4 actors in the database

  public int id;
  public String firstName;
  public String lastName;
  public int birthYear;
  public int movieId;

  static {
    new Actor(1, "John", "Travolta", 1875, 1);
    new Actor(2, "Joe", "Mama", 1969, 2);
    new Actor(3, "Katnis", "Everdeen", 1993, 2);
    new Actor(4, "Megan", "Fox", 1990, 1);
  }

  public Actor(int id, String firstName, String lastName, int birthYear, int movieId) {
    this.id = ++count;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthYear = birthYear;
    this.movieId = movieId;

    actors.add(this);
  }
}
