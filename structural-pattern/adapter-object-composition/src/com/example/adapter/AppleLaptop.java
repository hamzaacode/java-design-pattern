package com.example.adapter;

public class AppleLaptop implements Laptop{
    @Override
    public void read() {
        System.out.println(" Reading from apple laptop");
    }

    @Override
    public void write() {
        System.out.println(" Writting from apple laptop");
    }
}
