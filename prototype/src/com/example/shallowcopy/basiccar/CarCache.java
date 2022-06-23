package com.example.shallowcopy.basiccar;

import java.util.Hashtable;

public class CarCache {

    private static Hashtable<String, BasicCar> carHashtable = new Hashtable<String, BasicCar>();

    public static Hashtable<String, BasicCar> loadCarCache() {
        BasicCar carNano = new Nano();
        carNano.setName("Nano");
        carNano.setPrice(10000);

        BasicCar carFord = new Ford();
        carFord.setName("Ford");
        carFord.setPrice(15000);

        carHashtable.put(carFord.getName(), carNano);
        carHashtable.put(carNano.getName(), carFord);
        return carHashtable;
    }

    public BasicCar getCar(String carName) {
        BasicCar car = carHashtable.get(carName);
        BasicCar newCar = (BasicCar) car.clone();
        return newCar;
    }
}
