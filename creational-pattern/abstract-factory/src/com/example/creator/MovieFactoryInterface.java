package com.example.creator;

public interface MovieFactoryInterface {
    HollywoodMovies getHollywoodMovie(String movieType);
    BollywoodMovies getBollywoodMovie(String movieType);
}
