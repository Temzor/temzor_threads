package ru.j4j.tracker.action;

import ru.j4j.tracker.*;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.model.Item;
import ru.j4j.tracker.model.MenuEnum;
import ru.j4j.tracker.output.Output;

import java.util.List;

public class FindByName implements UserAction {
    private final Output out;

    public FindByName(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.FIND_NAME_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Вывод заявок по имени ===");
        String name = input.askStr("Введите имя: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}
