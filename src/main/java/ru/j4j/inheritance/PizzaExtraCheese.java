package ru.j4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    public String name() {
        return super.name() + " with extra cheese";
    }
}
