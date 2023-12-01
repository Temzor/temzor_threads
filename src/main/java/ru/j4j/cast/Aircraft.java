package ru.j4j.cast;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println("Move to flying");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel: aircraft diesel");
    }
}
