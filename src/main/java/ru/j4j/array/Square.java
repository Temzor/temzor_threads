package ru.j4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] ints = new int[bound];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int) Math.pow(i, 2);
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
