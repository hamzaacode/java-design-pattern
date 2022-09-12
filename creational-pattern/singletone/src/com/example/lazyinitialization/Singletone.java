package com.example.lazyinitialization;


// Must have to be a Singletone:
// A private constructor
// A static field containing its only instance
// A static factory method for obtaining the instance

// Uses of singletone : loggings , Driver object , Database connection obj, caching , thread pool,
public class Singletone {
    private static Singletone instance;
    private String info = "Initial info class";
    private Singletone() {

    }
    public static Singletone getInstance() {
        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
