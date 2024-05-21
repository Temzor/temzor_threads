package ru.code.eight;

public class ToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                result[i] = (int) Math.sqrt(array[i]);
            } else {
                result[i] = (int) Math.pow(array[i], 2);
            }
        }
        return result;
    }
}
