package ru.code.eight;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        long[] array = new long[n + 1];
        array[0] = 1;
        for (int i = 1; i <= n; i++) {
            array[i] = 2 * array[i - 1];
        }
        return array;
    }
}
