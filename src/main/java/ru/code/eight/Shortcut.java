package ru.code.eight;

public class Shortcut {
    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }
}
