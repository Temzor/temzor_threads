package ru.j4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MatrixToList {
    public static List<Integer> convert(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(Stream::of)
                .toList();
    }
}
