package com.example.turkeyadapter;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println(" Mallard Duck says quack quack !! ");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck says I am flying ...");
    }
}
