package ru.j4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return -1;
    }
}
