package ru.j4j.tracker.action;

import ru.j4j.tracker.*;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.model.Item;
import ru.j4j.tracker.model.MenuEnum;
import ru.j4j.tracker.output.Output;

public class Create implements UserAction {
    private final Output out;

    public Create(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.ADD_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        out.println("Добавленная заявка: " + item);
        return true;
    }
}
