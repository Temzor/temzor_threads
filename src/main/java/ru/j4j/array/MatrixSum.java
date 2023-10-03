package ru.j4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int sum = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                sum += anInt;
            }

        }
        return sum;
    }
}
