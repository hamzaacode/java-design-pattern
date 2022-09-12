package com.example.client;

import com.example.concreatecreator.ConcreateAnimalFactoryMethod;
import com.example.creator.Animal;

public class FactoryMethodClient {

    public static void main(String[] args) {
        Animal tiger = new ConcreateAnimalFactoryMethod().getAnimalType("tiger");
        tiger.roar();
    }
}
