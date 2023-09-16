package ru.j4j.condition;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        final double P = (a + b + c) / 2;
        return Math.sqrt(P * (P - a) * (P - b) * (P - c));
    }
}
