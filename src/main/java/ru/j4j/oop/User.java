package ru.j4j.oop;

public class User {
    private String name;
    private int age;

    public boolean canDrive() {
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
