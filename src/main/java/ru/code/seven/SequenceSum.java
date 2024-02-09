package ru.code.seven;

import static java.util.stream.IntStream.iterate;

public class SequenceSum {
    public static int sequenceSum(int start, int end, int step) {
        return iterate(start, i -> i <= end, i -> i + step).sum();
    }
}
