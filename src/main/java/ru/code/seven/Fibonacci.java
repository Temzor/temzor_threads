package ru.code.seven;

public class Fibonacci {
    public static long fib(int n) {
        return n == 0 ? 0
                : n == 1 ? 1
                : fib(n - 1) + fib(n - 2);
    }
}
