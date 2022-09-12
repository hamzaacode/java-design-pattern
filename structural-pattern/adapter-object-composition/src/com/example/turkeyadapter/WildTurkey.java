package com.example.turkeyadapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Wild Turkey says Gobble bobble.. ");
    }

    @Override
    public void fly() {
        System.out.println("Wild Turkey says I am flying a short distance.. ");
    }
}
