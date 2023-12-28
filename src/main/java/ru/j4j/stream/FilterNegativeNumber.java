package ru.j4j.stream;

import java.util.Arrays;
import java.util.List;

public class FilterNegativeNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, -3, -1, 1, 3, 5);
        List<Integer> positive = numbers.stream().filter(n -> n > 0).toList();
        positive.forEach(System.out::println);

    }
}
