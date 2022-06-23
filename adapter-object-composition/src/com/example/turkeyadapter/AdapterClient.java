package com.example.turkeyadapter;

public class AdapterClient {

    public static void main(String[] args) {
        Duck turkeyAdapter = new TurkeyAdapter(new WildTurkey());
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
