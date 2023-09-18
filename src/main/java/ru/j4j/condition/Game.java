package ru.j4j.condition;

public class Game {
    public static String menu(String name) {
        if (name.equals("super mario")) {
            return "Start - super mario.";
        }
        if (name.equals("tanks")) {
            return "Start - tanks.";
        }
        if (name.equals("tetris")) {
            return "Start - tetris.";
        }
        return "I do not know what start.";
    }
}
