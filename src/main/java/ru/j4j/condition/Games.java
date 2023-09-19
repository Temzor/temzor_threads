package ru.j4j.condition;

public class Games {
    public static String permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            return "I can go to the computer club.";
        } else {
            return "I can't.";
        }
    }
}
