package com.example.adapter;

public class SamsungMemoryCard implements MemoryCard {
    @Override
    public void read() {
        System.out.println("Reading from Samsung Memory Card");
    }

    @Override
    public void write() {
        System.out.println("Writing from Samsung Memory Card ");
    }

    @Override
    public void remove() {
        System.out.println("Removing from Samsung Memory Card ");
    }
}
