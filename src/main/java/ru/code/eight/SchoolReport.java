package ru.code.eight;

import java.util.Arrays;

public class SchoolReport {
    public static int getAverage(int[] marks) {
        return Arrays.stream(marks)
                .sum()
                / marks.length;
    }
}
