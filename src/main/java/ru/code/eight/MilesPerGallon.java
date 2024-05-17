package ru.code.eight;

public class MilesPerGallon {
    public static float mpgToKPM(final float mpg) {
        return (float) (Math.round(((mpg / 4.54609188f) * 1.609344f) * 100.0) / 100.0);
    }
}
