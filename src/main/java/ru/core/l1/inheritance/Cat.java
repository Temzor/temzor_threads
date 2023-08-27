package ru.core.l1.inheritance;

public class Cat extends CatFamily {
    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("whiskas.");
    }
}
