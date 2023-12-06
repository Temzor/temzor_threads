package ru.j4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] duplicate = duplicateText.split(" ");
        Set<String> check = new HashSet<>(Arrays.asList(origin));
        for (String s : duplicate) {
            if (!check.contains(s)) {
                result = false;
                break;
            }
        }
        return result;
    }
}
