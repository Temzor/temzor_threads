package ru.code.eight;

import java.util.Arrays;

public class SquareSum {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).
                map(x -> (int) Math.pow(x, 2))
                .sum();
    }
}
