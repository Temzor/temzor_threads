package ru.code.eight;

import java.util.Arrays;

public class WellOfIdeas {
    public static String well(String[] x) {
        int count = (int) Arrays.stream(x)
                .filter(a -> a.equals("good"))
                .count();

        return count == 0 ? "Fail!" : count > 2 ? "I smell a series!" : "Publish!";
    }
}