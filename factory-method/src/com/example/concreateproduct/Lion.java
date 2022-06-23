package com.example.concreateproduct;

import com.example.creator.Animal;

public class Lion implements Animal {
    @Override
    public void roar() {
        System.out.println("Lion's roar ");
    }

    @Override
    public void walks() {
        System.out.println("Lion's walk ");
    }
}
