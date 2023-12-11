package ru.j4j.inheritance;

public class Engineer extends Profession {
    private final int experience;

    public Engineer(boolean degree, int experience) {
        super(degree);
        this.experience = experience;
    }
}
