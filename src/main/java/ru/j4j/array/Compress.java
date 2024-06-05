package ru.j4j.array;

public class Compress {
    public static int[] compress(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {
                        array[i] = array[j];
                        array[j] = 0;
                        break;
                    }
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 0, 0, 2, 0, 3, 0, 0, 4, 5, 6, 0, 7};
        int[] compressed = compress(array);
        for (int j : compressed) {
            System.out.print(j + " ");
        }
    }
}
