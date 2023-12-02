package ru.j4j.tracker;

public class FindAllAction implements UserAction {
    private final Output out;

    public FindAllAction(Output out) {
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
