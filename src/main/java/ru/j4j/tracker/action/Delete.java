package ru.j4j.tracker.action;

import ru.j4j.tracker.*;

public class Delete implements UserAction {
    private final Output out;

    public Delete(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.REMOVE_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id заявки:");
        Item item = tracker.findById(id);
        tracker.delete(id);
        out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
        return true;
    }
}
