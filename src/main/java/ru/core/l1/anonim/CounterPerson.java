package ru.core.l1.anonim;

public class CounterPerson implements Counter {

    @Override
    public String report(int moth) {
        return "Report for: " + moth + " month.";
    }
}
