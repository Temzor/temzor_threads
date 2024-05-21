package ru.code.eight;

public class Stringy {
    public static String stringy(int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result.append("1");
            } else if (i % 2 != 0) {
                result.append("0");
            }
        }
        return result.toString();
    }
}
