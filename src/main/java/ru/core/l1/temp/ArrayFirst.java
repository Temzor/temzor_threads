package ru.core.l1.temp;

public class ArrayFirst {
    public static void main(String[] args) {
        int[] firstArray = new int[900];
        int[] secondArray = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 100;
        }

        for (int i = 0, j = firstArray.length - 1; i < firstArray.length; i++, j--) {
            secondArray[j] = firstArray[i];
        }

        for (int i : firstArray) {
            System.out.println(i);
        }

        for (int j : secondArray) {
            System.out.println(j);
        }
    }
}
