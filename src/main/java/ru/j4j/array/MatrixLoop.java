package ru.j4j.array;

public class MatrixLoop {
    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3},
                {7, 1},
                {3, 5, 6, 4}
        };

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
