package ru.core.l1.temp;

public class SpeedLight {
   private final int days = 1000;
    private final int speed = 300000;

    public static void main(String[] args) {
        SpeedLight speedLight = new SpeedLight();
        System.out.println("Distance in fly to light speed even: \nat days in fly " + speedLight.days
        + "\nat speed " + speedLight.speed + "\n" + speedLight.distance(speedLight.days, speedLight.speed));
    }
    private long distance (int days, int speed) {
        return speed * (days * 86400L);
    }
}
