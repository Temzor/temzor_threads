package ru.j4j.array;

public class SwitchArray {
    public static int[] swap(int[] array) {
        if (array.length == 0) {
            return array;
        }
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}