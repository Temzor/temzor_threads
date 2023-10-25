package ru.j4j.oop;

public class Cat {
    public String sound() {
        return "may-may";
    }
    public static void main(String[] args) {
        Cat petty = new Cat();
        Cat sparky = new Cat();
        System.out.println("Petty says: " + petty.sound());
        System.out.println("Sparky says: " + sparky.sound());
    }
}
