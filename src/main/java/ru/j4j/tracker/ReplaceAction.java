package ru.j4j.tracker;

public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return MenuEnum.CHANGE_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Изменение названия заявки ===");
        int id = input.askInt("Введите id заявки:");
        Item item = new Item(input.askStr("Введите новое название заявки: "));
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
        return true;
    }
}
