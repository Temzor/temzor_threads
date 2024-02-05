package ru.code.eight;

public class CollatzConjecture {
    public static int hotpo(int n) {
        int counter = 0;
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            counter++;
        }
        return counter;
    }
}

