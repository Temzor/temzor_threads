package ru.core.l1.monster;

public class Monster {
    private final int countEyes;
    private final int countLegs;
    private final int countHands;

    public Monster(int countEyes, int countLegs, int countHands) {
        this.countEyes = countEyes;
        this.countLegs = countLegs;
        this.countHands = countHands;
    }

    public Monster(int countEyes, int countLegs) {
        this.countEyes = countEyes;
        this.countLegs = countLegs;
        this.countHands = 2;
    }

    public Monster(int countEyes) {
        this.countEyes = countEyes;
        this.countLegs = 2;
        this.countHands = 2;
    }

    public Monster() {
        this.countEyes = 2;
        this.countLegs = 2;
        this.countHands = 2;
    }

    public void voice() {
        System.out.println("Voice");
    }

    public void voice(int i) {
        for (int j = 0; j < i; j++) {
            voice();
        }
    }

    public void voice(int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }
}
