package ru.j4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int i = 0; i <= n; i++) {
            result += result + i;
        }
        return result - 1;
    }
}
