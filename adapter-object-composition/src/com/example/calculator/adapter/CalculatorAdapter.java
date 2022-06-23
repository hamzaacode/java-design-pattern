package com.example.calculator.adapter;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {

        Rectangle rectangle1=new Rectangle();
        rectangle1.setLength(0.5* triangle.getBase());
        rectangle1.setWidth(triangle.getHeight());
        return new Calculator().getArea(rectangle1);
    }
}
