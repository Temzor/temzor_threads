package ru.j4j.oop;

public class Ball {
    public void tryRun(Boolean condition) {
        if (condition) {
            System.out.println("Ball is eaten.");
        } else {
            System.out.println("Ball is run");
        }
    }
}
