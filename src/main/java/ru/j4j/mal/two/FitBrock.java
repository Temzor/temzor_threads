package ru.j4j.mal.two;

public class FitBrock {
    public static double manWeight(short height) {
        return (((height * 4) / 2.54) - 128) * 0.453;
    }

    public static double womanWeight(short height) {
        return (((height * 3.5) / 2.54) - 108) * 0.453;
    }
}
