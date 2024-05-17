package ru.code.eight;

import java.util.Arrays;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers)
                .filter(e -> e % divider == 0)
                .toArray();
    }
}
