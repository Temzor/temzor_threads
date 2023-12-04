package ru.j4j.tracker.action;

import ru.j4j.tracker.*;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.model.Item;
import ru.j4j.tracker.model.MenuEnum;
import ru.j4j.tracker.output.Output;

public class FindById implements UserAction {
    private final Output out;

    public FindById(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.FIND_ID_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Поиск заявки по id ===");
        int id = input.askInt("Введите id заявки:");
        Item item = tracker.findById(id);
        out.println(item != null ? item : "Заявки с введенным id: " + id + " не существует");
        return true;
    }
}
