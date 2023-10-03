package ru.j4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] number : numbers) {
            System.out.println("Размер вложенного массива равен: " + number.length);
        }

        int[][] ints = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int[] num : ints) {
            System.out.println("Размер вложенного массива равен: " + num.length);
        }
    }
}
