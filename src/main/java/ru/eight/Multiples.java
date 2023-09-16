package ru.eight;

public class Multiples {
    public static int[] find(int base, int limit) {
        int[] result = new int[limit / base];
        int counter = base;
        for (int i = 0; i < result.length; i++) {
            result[i] = counter;
            counter += base;
        }
        return result;
    }
}
