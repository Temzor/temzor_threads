package ru.j4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        if (array == null || array.length < 2) {
            return new int[] {};
        }

        int i = 0;
        int j = array.length - 1;

        while (i < j) {
            int sum = array[i] + array[j];
            if (sum == target) {
                return new int[] {i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {};
    }
}
