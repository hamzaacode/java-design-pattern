package com.example.calculator.adapter;

public class Calculator implements CalculatorInterface {
    @Override
    public double getArea(Rectangle rectangle) {
        double area = rectangle.getLength() * rectangle.getWidth();
        return area;
    }
}
