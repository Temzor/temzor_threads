package ru.core.l1.inheritance;

public class Lion extends CatFamily {
    public Lion() {
        super(2, 4, true);
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("meat.");
    }
}
