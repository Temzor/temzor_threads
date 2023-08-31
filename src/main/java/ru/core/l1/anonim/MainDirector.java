package ru.core.l1.anonim;

public class MainDirector {
    public static void main(String[] args) {
        DirectorCounter director = new DirectorCounter();
        CounterPerson counterPerson = new CounterPerson();

        director.force(moth -> "Report for: " + moth + " month.", 16);

        director.force(counterPerson, 14);
    }
}
