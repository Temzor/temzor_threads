package ru.j4j.array;

public class Defragmentation {
    public static int[] compress(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {

            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }
}
