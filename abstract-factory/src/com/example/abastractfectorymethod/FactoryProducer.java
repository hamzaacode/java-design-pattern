package com.example.abastractfectorymethod;

import com.example.concreatefactorymethod.BollywoodMovieFactory;
import com.example.concreatefactorymethod.HollywoodMovieFactory;
import com.example.creator.MovieFactoryInterface;

/*
AbstractFactory: Declares an interface for operations that create abstract product objects.
ConcreteFactory: Implements the operations declared in the AbstractFactory to create concrete product objects.
Product: Defines a product object to be created by the corresponding concrete factory and implements the AbstractProduct interface.
Client: Uses only interfaces declared by AbstractFactory and AbstractProduct classes.

Difference:

        The main difference between a “factory method” and an “abstract factory” is that the factory method is a single method, and an abstract factory is an object.
        The factory method is just a method, it can be overridden in a subclass, whereas the abstract factory is an object that has multiple factory methods on it.
        The Factory Method pattern uses inheritance and relies on a subclass to handle the desired object instantiation.

Advantages:

        This pattern is particularly useful when the client doesn’t know exactly what type to create.

 */
public class FactoryProducer {

    public MovieFactoryInterface getMovieFactory(String factoryType) {

        if (factoryType == null) {
            return null;
        } else if (factoryType.equalsIgnoreCase("Hollywood")) {
            return new HollywoodMovieFactory();
        } else if (factoryType.equalsIgnoreCase("Bollywood")) {
            return new BollywoodMovieFactory();
        }
        return null;
    }
}
