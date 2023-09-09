package ru.core.l2.test;

public class Calculator {
    public static double concat(double a, double b) {
        return a + b;
    }

    public static double concat(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static double minus(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divided(double a, double b) {
        return a / b;
    }
}
