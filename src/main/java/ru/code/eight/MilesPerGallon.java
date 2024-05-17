package ru.code.eight;

public class MilesPerGallon {
    private static final float LITER = 4.54609188f;
    private static final float KILOMETER = 1.609344f;

    public static float mpgToKPM(final float mpg) {
        return (float) (Math.round(((mpg / LITER) * KILOMETER) * 100.0) / 100.0);
    }
}
