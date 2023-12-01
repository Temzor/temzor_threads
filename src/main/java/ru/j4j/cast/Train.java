package ru.j4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Move to railway");
    }

    @Override
    public void fuel() {
        System.out.println("Fuel: diesel generator(DG), fact to electric");

    }
}
