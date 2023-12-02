package ru.j4j.tracker.action;

import ru.j4j.tracker.Input;
import ru.j4j.tracker.MenuEnum;
import ru.j4j.tracker.Output;
import ru.j4j.tracker.Tracker;

public class Exit implements UserAction {
    private final Output out;

    public Exit(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.EXIT.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
       out.println("=== Завершение программы ===");
        return false;
    }
}
