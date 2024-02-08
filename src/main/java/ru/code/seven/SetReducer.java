package ru.code.seven;

import java.util.LinkedList;
import java.util.List;

public class SetReducer {
    public static int setReducer(int[] input) {
        int[] reduced = reduce(input);
        return reduced[0];
    }

    public static int[] reduce(int[] input) {
        List<Integer> reducedList = new LinkedList<>();
        int repeats = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i] == input[i - 1]) {
                repeats++;
            } else {
                reducedList.add(repeats);
                repeats = 1;
            }
        }
        reducedList.add(repeats);

        int[] reduced = new int[reducedList.size()];
        for (int i = 0; i < reduced.length; i++) {
            reduced[i] = reducedList.get(i);
        }

        if (reduced.length == 1) {
            return reduced;
        } else {
            return reduce(reduced);
        }
    }
}
