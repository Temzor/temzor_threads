package ru.j4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return MenuEnum.FIND_ID_TICKET.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Поиск заявки по id ===");
        int id = input.askInt("Введите id заявки:");
        Item item = tracker.findById(id);
        System.out.println(item != null ? item : "Заявки с введенным id: " + id + " не существует");
        return true;
    }
}
