package com.example.client;

import com.example.abastractfectorymethod.FactoryProducer;
import com.example.creator.MovieFactoryInterface;

public class MovieClient {


    public static void main(String[] args) {
        MovieFactoryInterface hollywoodFactory = new FactoryProducer().getMovieFactory("hollywood");

        System.out.println(hollywoodFactory.getHollywoodMovie("action").genreName());
        System.out.println(hollywoodFactory.getHollywoodMovie("comedy").genreName());

        MovieFactoryInterface bollywoodFactory = new FactoryProducer().getMovieFactory("Bollywood");

        System.out.println(bollywoodFactory.getBollywoodMovie("action").genreName());
        System.out.println(bollywoodFactory.getBollywoodMovie("comedy").genreName());



    }
}
