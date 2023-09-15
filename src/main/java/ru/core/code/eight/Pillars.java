package ru.core.code.eight;

public class Pillars {
    public static int pillars(int numPill, int dist, int width) {
        if (numPill <= 1) {
            return 0;
        }
        return ((numPill - 1) * dist * 100) + ((numPill - 2) * width);
    }
}


