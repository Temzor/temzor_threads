package ru.code.seven;
import static java.util.stream.IntStream.range;

public class ClosingInSum {
    public static int closingInSum(long n) {
        String s = String.valueOf(n);
        return range(0, s.length())
                .map(i -> (i < s.length() / 2 ? 10 : 1) * (s.charAt(i) - 48))
                .sum();
    }
}
