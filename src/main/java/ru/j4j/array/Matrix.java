package ru.j4j.array;

/**
 * Utility class for creating multiplication tables.
 */
public class Matrix {

    /**
     * Generates a multiplication table of the given size.
     *
     * @param size the size of the multiplication table
     * @return a two-dimensional array representing the multiplication table
     */
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];

        // Caching the length of the array for better performance
        int length = table.length;

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }
        return table;
    }
}