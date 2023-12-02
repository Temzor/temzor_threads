package ru.j4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return MenuEnum.EXIT.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Завершение программы ===");
        return false;
    }
}
