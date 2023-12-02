package ru.j4j.tracker;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
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
