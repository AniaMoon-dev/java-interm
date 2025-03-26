package com.lm2a.lambdas.calculadora;

public class UseCalculator {

    public static void main(String[] args) {

        ICalculator sum = (x, y) -> x + y;

        ICalculator substract = (x, y) -> x - y;

        ICalculator multiply = (x, y) -> x * y;

        ICalculator division = (x, y) -> x / y;

        System.out.println("Suma: "+calculate(3.0, 7.0, sum));

        System.out.println("Division: "+calculate(13.0, 7.0, division));

    }


    public static double calculate(double a, double b, ICalculator calculator) {
        return calculator.operation(a, b);
    }
}
