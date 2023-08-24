package ru.core.l1.monster;

public class Main {
    public static void main(String[] args) {
        Monster firsMonster = new Monster();
        Monster secondMonster = new Monster(8);
        Monster thirdMonster = new Monster(6, 12);
        Monster fouthMonster = new Monster(9, 7, 15);

        firsMonster.voice();
        secondMonster.voice(3);
        secondMonster.voice(5, "Auu...");
    }
}
