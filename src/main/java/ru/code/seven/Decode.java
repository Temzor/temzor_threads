package ru.code.seven;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Decode {

    public static String decode(int[] code, int key) {
        return IntStream
                .range(0, code.length)
                .mapToObj(i -> Character.toString((char) code[i] - Character.getNumericValue(String.valueOf(key).charAt(i % String.valueOf(key).length())) + 96))
                .collect(Collectors.joining());
    }
}

