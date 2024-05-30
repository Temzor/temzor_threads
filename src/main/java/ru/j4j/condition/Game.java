package ru.j4j.condition;

public class Game {
    public static String menu(String name) {
        if ("super mario".equals(name)) {
            return "Start - super mario.";
        }
        if ("tanks".equals(name)) {
            return "Start - tanks.";
        }
        if ("tetris".equals(name)) {
            return "Start - tetris.";
        }
        return "I do not know what start.";
    }
}
