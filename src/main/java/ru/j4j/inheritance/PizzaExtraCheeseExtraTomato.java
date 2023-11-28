package ru.j4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    @Override
    public String name() {
        return super.name() + " with extra tomato";
    }
}
