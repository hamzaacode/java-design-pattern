package com.example.doublechecklocking;


// Must have to be a Singletone:
// A private constructor
// A static field containing its only instance
// A static factory method for obtaining the instance

// Uses of singletone : loggings , Driver object , Database connection obj, caching , thread pool,
public class DoubleCheckLockingSingletone {
    private static DoubleCheckLockingSingletone instance;
    private String info = "Initial info class";

    private DoubleCheckLockingSingletone() {

    }

    public static DoubleCheckLockingSingletone getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLockingSingletone.class) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingletone();
                }
            }
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
