package ru.j4j.tracker;

import ru.j4j.tracker.action.*;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            UserAction action = actions[select];
            run = action.execute(input, tracker);

        }

    }

    private void showMenu(UserAction[] actions) {
        out.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            out.println(index + ". " + actions[index].name());

        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Create(output),
                new FindAll(output),
                new Replace(output),
                new Delete(output),
                new FindById(output),
                new FindByName(output),
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, actions);
    }
}