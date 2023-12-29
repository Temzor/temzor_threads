package ru.code.six;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RainTacos {
    public static String rainTacos(String landscape) {
        char[][] arr = Arrays.stream(landscape.split("\n")).map(String::toCharArray).toArray(char[][]::new);
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[0][j] == ' ') {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i][j] == ' ' && (i + 1 == arr.length || arr[i + 1][j] != ' ')) {
                        arr[i][j] = "TACO".charAt(j % 4);
                        break;
                    }
                }
            }
        }
        return Arrays.stream(arr).map(String::new).collect(Collectors.joining("\n"));
    }
}

