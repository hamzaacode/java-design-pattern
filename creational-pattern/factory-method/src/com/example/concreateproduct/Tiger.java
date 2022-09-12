package com.example.concreateproduct;

import com.example.creator.Animal;

public class Tiger implements Animal {

    @Override
    public void roar() {
        System.out.println("Tiger's roar ");
    }

    @Override
    public void walks() {
        System.out.println("Tiger's walk ");
    }
}
