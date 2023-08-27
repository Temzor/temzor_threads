package ru.core.l1.temp;

public class Array {
    public static void main(String[] args) {
        int[] daysInMonth = new int[12];
        for (int i = 0; i < daysInMonth.length; i++) {
            if (i % 2 == 0) {
                daysInMonth[i] = 31;
            }
            if (i == 1) {
                daysInMonth[i] = 28;
            }
            if (i % 2 != 0 && i != 1) {
                daysInMonth[i] = 30;
            }
        }

        for (int i : daysInMonth) {
            System.out.println(i);
        }

    }
}
