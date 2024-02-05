package ru.code.eight;

public class CollatzConjecture {
    public static int hotpo(int n) {
        return n <= 1 ? 0 : 1 + hotpo(n % 2 == 0 ? n / 2 : 3 * n + 1);
    }
}

