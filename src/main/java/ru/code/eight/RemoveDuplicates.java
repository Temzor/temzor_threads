package ru.code.eight;


public class RemoveDuplicates {
    public static int removeDuplicates(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[result]) {
                result++;
                a[result] = a[i];
            }
        }
        return result + 1;

    }
}
