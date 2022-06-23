package com.example.shallowcopy.basiccar;

public class Ford extends BasicCar {

    public Ford() {
        price = 15000;
    }

    @Override
    void startEngine() {
        System.out.println("Ford engine started...");
    }

    @Override
    public BasicCar clone() {
        return (Ford) super.clone();
    }
}
