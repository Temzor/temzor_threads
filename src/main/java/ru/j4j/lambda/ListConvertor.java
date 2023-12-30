package ru.j4j.lambda;

import java.util.Collection;
import java.util.List;

public class ListConvertor {
    public static void main(String[] args) {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(
                matrix.stream().flatMap(Collection::stream).toList()
        );
    }
}
