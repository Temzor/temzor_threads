package ru.j4j.cast;

public class MainCast {
    public static void main(String[] args) {
        Vehicle aircraftFirst = new Aircraft();
        Vehicle aircraftSecond = new Aircraft();
        Vehicle trainFirst = new Train();
        Vehicle trainSecond = new Train();
        Vehicle busFirst = new Bus();
        Vehicle busSecond = new Bus();

        Vehicle[] vehicles = new Vehicle[]{aircraftFirst, aircraftSecond, trainFirst, trainSecond, busFirst, busSecond};
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName());
            vehicle.move();
            vehicle.fuel();
        }
    }
}
