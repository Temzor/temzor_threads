package ru.j4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean datum : data) {
            if (data[0] != datum) {
                return false;
            }
        }
        return true;
    }
}
