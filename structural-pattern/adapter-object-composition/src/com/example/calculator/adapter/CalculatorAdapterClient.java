package com.example.calculator.adapter;

public class CalculatorAdapterClient {

    public static void main(String[] args) {
        CalculatorInterface calculator = new Calculator();

        double rectangleArea = calculator.getArea(new Rectangle(10, 10));

        System.out.println(" Rectangle Area is:" + rectangleArea);

        CalculatorAdapter calculatorAdapter=new CalculatorAdapter(new Triangle(10,10));

        System.out.println(calculatorAdapter.getArea(null));
    }
}
