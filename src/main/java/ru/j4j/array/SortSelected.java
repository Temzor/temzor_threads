package ru.j4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMinDiapason(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            data = SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
