package ru.j4j.loop;

public class Factorial {
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
