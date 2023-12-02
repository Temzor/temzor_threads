package ru.j4j.tracker;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return MenuEnum.EXIT.getInfo();
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
       out.println("=== Завершение программы ===");
        return false;
    }
}
