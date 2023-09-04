package ru.core.l2.test;

public class Calculator {
    public double concat(double a, double b) {
        return a + b;
    }

    public double concat(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divided(double a, double b) {
        return a / b;
    }
}
