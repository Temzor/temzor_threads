package ru.core.l1.interfacea;

public class Driver extends Worker implements CanDriver {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void canDrive() {
        System.out.println("Drive a car");
    }
}
