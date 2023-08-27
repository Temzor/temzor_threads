package ru.core.l1.inheritance;

public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.print("Eat the ");
    }
    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public int getEars() {
        return ears;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isBigClaws() {
        return bigClaws;
    }

    @Override
    public String toString() {
        return String.format("CatFamily(ears=%s ,legs=%s ,bigClaws=%s)",
                this.ears,
                this.legs,
                this.bigClaws);
    }
}
