package ru.core.l1.math;

public class Math {
    private static final double PI = java.lang.Math.PI;

    public static double square(int number) {
        return java.lang.Math.pow(number, 2);
    }

    public static double length(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI * java.lang.Math.pow(radius, 2);
    }

    public static int sum(int... number) {
        int sum = 0;
        for (int i : number) {
            sum += i;
        }
        return sum;
    }
}
