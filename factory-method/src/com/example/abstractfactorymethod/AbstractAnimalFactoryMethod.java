package com.example.abstractfactorymethod;

import com.example.creator.Animal;

public abstract  class AbstractAnimalFactoryMethod {

    protected abstract Animal getAnimalType(String animalType);
}
