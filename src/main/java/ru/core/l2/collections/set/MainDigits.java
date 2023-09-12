package ru.core.l2.collections.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainDigits {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
