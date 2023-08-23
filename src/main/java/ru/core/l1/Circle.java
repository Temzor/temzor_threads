package ru.core.l1;

public class Circle {
    double pi = 3.14;
    double radius = 10.1845125;
    double square = squareCircle(pi, radius);
    private static double squareCircle(double pi, double radius) {
        return pi * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Square circle even: " + circle.square);
    }
}
