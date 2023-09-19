package ru.j4j.condition;

public class Club {
    public static String permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            return "I can go to the club.";
        } else {
            return "I can't.";
        }
    }
}