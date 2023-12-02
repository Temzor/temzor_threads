package ru.j4j.tracker.action;

import ru.j4j.tracker.*;

public class Replace implements UserAction {
    private final Output out;

    public Replace(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.CHANGE_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id заявки:");
        Item item = new Item(input.askStr("Введите новое название заявки: "));
        if (tracker.replace(id, item)) {
            out.println("Заявка изменена успешно.");
        } else {
            out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
