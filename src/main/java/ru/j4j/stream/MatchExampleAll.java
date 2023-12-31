package ru.j4j.stream;

import java.util.Arrays;
import java.util.List;

public class MatchExampleAll {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Трижды", "Три", "Триста", "Три тысячи");
        boolean result = strings
                .stream()
                .allMatch(element -> element.startsWith("Три"));
        System.out.println(result);
    }
}
