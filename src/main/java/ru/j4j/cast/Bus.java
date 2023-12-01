package ru.j4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Move to highway");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel: benzine");
    }
}
