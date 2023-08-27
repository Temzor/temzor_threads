package ru.core.l1.inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(lion);
        System.out.println(cat);
        cat.eat();
        lion.eat();
    }
}
