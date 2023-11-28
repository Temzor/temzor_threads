package ru.j4j.oop;

public abstract class Vehicle {
    private String brand;
    private String model;
    private String type;
    private String passengers;
    private String maxSpeed;

    public abstract void accelerator();
    public abstract void steer();
    public void brake() {
        System.out.println("Standard brake system");
    }
}
