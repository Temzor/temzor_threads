package ru.j4j.tracker;

import ru.j4j.tracker.action.*;
import ru.j4j.tracker.input.ConsoleInput;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.logger.Log4File;
import ru.j4j.tracker.output.ConsoleOutput;
import ru.j4j.tracker.output.Output;
import ru.j4j.validate.ValidateInput;

import java.util.Arrays;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Неверный ввод, вы можете выбрать: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Меню:");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());

        }
    }

    public static void main(String[] args) {
        Log4File log = Log4File.getInstance();
        log.add("add new Item");
        log.save();
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = Arrays.asList(
                new Create(output),
                new FindAll(output),
                new Replace(output),
                new Delete(output),
                new FindById(output),
                new FindByName(output),
                new Exit(output)
        );
        new StartUI(output).init(input, tracker, actions);
    }
}