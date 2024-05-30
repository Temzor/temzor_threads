package ru.j4j.loop;

public class Fitness {

    private static final int IVAN_GROWTH_RATE = 3;
    private static final int NIK_GROWTH_RATE = 2;

    /**
     * Calculates the number of months needed for Ivan to surpass Nik in strength.
     * @param ivan Initial strength of Ivan
     * @param nik Initial strength of Nik
     * @return Number of months required for Ivan to surpass Nik
     */
    public static int calc(int ivan, int nik) {
        if (ivan < 0 || nik < 0) {
            throw new IllegalArgumentException("Strength values must be non-negative");
        }

        int month = 0;
        while (ivan <= nik) {
            ivan *= IVAN_GROWTH_RATE;
            nik *= NIK_GROWTH_RATE;
            month++;
        }
        return month;
    }
}
