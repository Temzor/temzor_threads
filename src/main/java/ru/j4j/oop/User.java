package ru.j4j.oop;

public class User {
    private String name;
    private int age;

    public boolean canDrive() {
        boolean can = age >= 18;
        return can;
    }
}
