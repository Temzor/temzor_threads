package ru.j4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        return right[right.length - 1] == left[left.length - 1];
    }
}