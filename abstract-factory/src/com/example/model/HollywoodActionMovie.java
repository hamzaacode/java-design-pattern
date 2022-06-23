package com.example.model;

import com.example.creator.HollywoodMovies;

public class HollywoodActionMovie implements HollywoodMovies {
    private static final String  movieGenre = "ACTION";
    private String name;

    public HollywoodActionMovie() {
    }

   public HollywoodActionMovie(String movieName) {
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
