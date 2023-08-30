package ru.core.l1.interfacea;

public class Cat extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Whiskas");
    }

    public void run() {
        System.out.println("Cat run at the fourth paws");
    }
}
