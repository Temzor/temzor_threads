package ru.j4j.polymorph;

public interface Vehicle extends Fuel {
    /**
     * "int WHEELS = 4" equals "public static final int WHEELS = 4";
     */
    int WHEELS = 4;
    void accelerate();

    void brake();

    void steer();

    void changeGear();

    static void getDragCoefficient() {
        System.out.println("Формула расчета коэффициента аэродинамического сопротивления автомобиля");
    }

    default void chargeBattery() {
        System.out.println("Аккумулятор под капотом. Зарядить.");
    }
}
