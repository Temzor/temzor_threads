package ru.core.l1.collections.array;

public class Man {
    private final String name;
    private final String position;
    private final int age;
    private final double height;

    public Man(String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Man(name=%s ,position=%s ,age=%s ,height=%s)",
                this.name,
                this.position,
                this.age,
                this.height);
    }
}
