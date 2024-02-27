package ru.code.seven;

import java.util.Arrays;

public class Alphabet {
    public static long alphabet(long[] ns) {
        Arrays.sort(ns);
        return ns[7] / (ns[0] * ns[1] == ns[2] ? ns[3] : ns[2]);
    }
}
