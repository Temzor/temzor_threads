package ru.core.l1;

public class Loop {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
