package ru.j4j.oop;

public class Truck extends Vehicle {
    @Override
    public void accelerator() {
        System.out.println("Electronic pedal accelerate");
    }

    @Override
    public void steer() {
        System.out.println("Standard steer system");

    }
}
