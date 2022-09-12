package com.example.model;

import com.example.creator.BollywoodMovies;

public class BollywoodActionMovie implements BollywoodMovies {
    private static final String movieGenre = "ACTION";
    private String name;

    public BollywoodActionMovie() {

    }

    public BollywoodActionMovie(String movieName) {
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
