package com.example.model;

import com.example.creator.BollywoodMovies;

public class BollywoodComedyMovie implements BollywoodMovies {
    private static final String movieGenre = "COMEDY";

    private String name;

    public  BollywoodComedyMovie() {

    }

    public BollywoodComedyMovie(String movieName) {
        this.name = movieName;
    }

    @Override
    public String genreName() {
        return movieGenre;
    }

    @Override
    public String getMovieName() {
        return name;
    }
}
