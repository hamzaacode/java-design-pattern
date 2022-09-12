package com.example.concreatecreator;

import com.example.abstractfactorymethod.AbstractAnimalFactoryMethod;
import com.example.creator.Animal;
import com.example.concreateproduct.Lion;
import com.example.concreateproduct.Tiger;

public class ConcreateAnimalFactoryMethod extends AbstractAnimalFactoryMethod {


    @Override
    public Animal getAnimalType(String animalType) {

        if (animalType == null) {
            return null;
        } else if (animalType.equalsIgnoreCase("Tiger")) {
            return new Tiger();
        } else if (animalType.equalsIgnoreCase("Lion")) {
            return new Lion();
        }
        return null;
    }
}
