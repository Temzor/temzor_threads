package ru.j4j.calculator;

public class Calculator {

    private static final int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public static int minus(int y) {
        return y - X;
    }

    public int multiply(int y) {
        return y * X;
    }

    public int divide(int y) {
        return y / X;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println(result);
        result = minus(10);
        System.out.println(result);
        result = calculator.multiply(10);
        System.out.println(result);
        result = calculator.divide(10);
        System.out.println(result);
        result = calculator.sumAllOperation(10);
        System.out.println(result);
    }
}
