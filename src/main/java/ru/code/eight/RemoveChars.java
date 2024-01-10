package ru.code.eight;

public class RemoveChars {
    public static String remove(String s) {

        if (s.length() <= 2) {
            return s;
        }
        return s.substring(1, s.length() - 1);
    }
}
