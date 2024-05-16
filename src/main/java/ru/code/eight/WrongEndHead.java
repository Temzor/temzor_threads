package ru.code.eight;

public class WrongEndHead {

    public static String[] fixTheMeerkat(String[] arr) {
        String[] result = new String[arr.length];
        int x = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[x] = arr[i];
            x++;
        }
        return result;
    }
}

