package ru.core.l1.interfacea;

public class Bird extends Animal implements CanRun, Flyable {
    @Override
    public void eat() {
        System.out.println("Bug");
    }

    @Override
    public void run() {
        System.out.println("Bird run at the twins paws");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flyable");
    }
}
