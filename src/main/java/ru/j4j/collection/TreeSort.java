package ru.j4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        Set<Integer> numbersReverseSort = new TreeSet<>(Collections.reverseOrder());
        numbersReverseSort.add(5);
        numbersReverseSort.add(1);
        numbersReverseSort.add(3);
        System.out.println(numbersReverseSort);
    }
}
