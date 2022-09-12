package com.example.shallowcopy.basiccar;

public class Nano extends BasicCar{


    public Nano (){
        price = 10000;
    }

    @Override
    void startEngine() {
        System.out.println("Nano engine started...");
    }

    @Override
    public BasicCar clone() {
        return (Nano) super.clone();
    }
}
