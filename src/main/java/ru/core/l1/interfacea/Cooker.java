package ru.core.l1.interfacea;

public class Cooker extends Worker implements CanCook {
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void canCook() {
        System.out.println("Cooking");
    }
}
