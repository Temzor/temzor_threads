package ru.j4j.array;

/**
 * Utility class for matrix operations.
 */
public class MatrixSum {

    /**
     * Calculates the sum of all elements in a two-dimensional array.
     *
     * @param matrix the input two-dimensional array
     * @return the sum of all elements in the array
     * @throws IllegalArgumentException if the input array is null
     */
    public static int sum(int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int totalSum = 0;

        for (int[] row : matrix) {
            if (row != null) {
                for (int element : row) {
                    totalSum += element;
                }
            }
        }

        return totalSum;
    }
}