package ru.j4j.tracker.action;

import ru.j4j.tracker.*;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.model.Item;
import ru.j4j.tracker.model.MenuEnum;
import ru.j4j.tracker.output.Output;

public class FindAll implements UserAction {
    private final Output out;

    public FindAll(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.SHOW_ALL_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
