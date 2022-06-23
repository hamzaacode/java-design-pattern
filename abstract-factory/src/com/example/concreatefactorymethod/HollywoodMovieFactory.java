package com.example.concreatefactorymethod;

import com.example.creator.BollywoodMovies;
import com.example.creator.HollywoodMovies;
import com.example.creator.MovieFactoryInterface;
import com.example.model.HollywoodActionMovie;
import com.example.model.HollywoodComedyMovie;

public class HollywoodMovieFactory implements MovieFactoryInterface {

    @Override
    public HollywoodMovies getHollywoodMovie(String movieType) {

        if (movieType == null) {
            return null;
        } else if (movieType.equalsIgnoreCase("Action")) {
            return new HollywoodActionMovie();
        } else if (movieType.equalsIgnoreCase("Comedy")) {
            return new HollywoodComedyMovie();
        }
        return null;
    }

    @Override
    public BollywoodMovies getBollywoodMovie(String movieType) {
        return null;
    }
}
