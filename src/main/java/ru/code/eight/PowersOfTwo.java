package ru.code.eight;

import static java.util.stream.LongStream.rangeClosed;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n) {
        return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
    }
}
