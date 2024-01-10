package ru.code.eight;

public class Paper {
    public static int paperWork(int n, int m) {
        return (n < 0) || (m < 0) ? 0 : n * m;
    }
}
