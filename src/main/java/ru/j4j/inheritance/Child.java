package ru.j4j.inheritance;

public class Child extends Parent {
    private final String patronymic;
    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }
}
