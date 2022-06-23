package com.example.concreatefactorymethod;

import com.example.creator.BollywoodMovies;
import com.example.creator.HollywoodMovies;
import com.example.creator.MovieFactoryInterface;
import com.example.model.BollywoodActionMovie;
import com.example.model.BollywoodComedyMovie;

public class BollywoodMovieFactory implements MovieFactoryInterface {

    @Override
    public BollywoodMovies getBollywoodMovie(String movieType) {
        if (movieType == null) {
            return null;
        } else if (movieType.equalsIgnoreCase("Action")) {
            return new BollywoodActionMovie();
        } else if (movieType.equalsIgnoreCase("comedy")) {
            return new BollywoodComedyMovie();
        }
        return null;
    }

    @Override
    public HollywoodMovies getHollywoodMovie(String movieType) {

        return null;
    }
}


