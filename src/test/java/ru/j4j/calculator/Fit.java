package ru.j4j.calculator;

public class Fit {

    private static final double COEFFICIENT = 1.15;
    private static final int MAN_HEIGHT_OFFSET = 100;
    private static final int WOMAN_HEIGHT_OFFSET = 110;

    /**
     * Calculates ideal weight for men based on height.
     * @param heightMan height of the man in cm
     * @return ideal weight in kg
     */
    public static double manWeight(short heightMan) {
        return (heightMan - MAN_HEIGHT_OFFSET) * COEFFICIENT;
    }

    /**
     * Calculates ideal weight for women based on height.
     * @param heightWoman height of the woman in cm
     * @return ideal weight in kg
     */
    public static double womanWeight(short heightWoman) {
        return (heightWoman - WOMAN_HEIGHT_OFFSET) * COEFFICIENT;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 170;

        double manIdealWeight = manWeight(heightMan);
        double womanIdealWeight = womanWeight(heightWoman);

        System.out.println("Man 187 is " + manIdealWeight);
        System.out.println("Woman 170 is " + womanIdealWeight);
    }
}
