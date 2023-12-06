package ru.j4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] row : list) {
            for (Integer cell : row) {
                result.add(cell);
            }
        }
        return result;
    }
}
