package com.example.shallowcopy.basiccar;

public class CarClient {

    public static void main(String[] args) {
        CarCache.loadCarCache();

        CarCache carCache=new CarCache();

        BasicCar fordCar =carCache.getCar("Ford");
        System.out.println("Basic ford price " + fordCar.price);

        BasicCar nanoCar =carCache.getCar("Nano");
        System.out.println("Basic nano price "+ nanoCar.price);

        BasicCar fordCar2 =carCache.getCar("Ford");
        System.out.println("Basic ford price " + fordCar2.price);

        BasicCar nanoCar2 =carCache.getCar("Nano");
        System.out.println("Basic nano price "+ nanoCar2.price);
    }
}
