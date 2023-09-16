package ru.j4j.fit;

public class Fit {

    public static float manWeight(float height) {
        return (height - 100) * 1.15f;
    }

    public static float womanWeight(float height) {
        return (height - 110) * 1.15f;
    }
}
