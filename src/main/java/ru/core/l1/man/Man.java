package ru.core.l1.man;

public class Man {
    private final String name;
    private final int age;
    private final float weight;

    public Man(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Man(name=%s ,age=%s ,weight=%s)",
                this.name,
                this.age,
                this.weight);
    }

    public int getAge() {
        return age;
    }
}
