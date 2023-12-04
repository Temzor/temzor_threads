package ru.j4j.tracker;

import org.junit.jupiter.api.Test;
import ru.j4j.tracker.action.*;
import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.input.MockInput;
import ru.j4j.tracker.model.Item;
import ru.j4j.tracker.output.Output;
import ru.j4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {
    @Test
    void whenExit() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString()).isEqualTo(
                "Меню:" + System.lineSeparator()
                        + "0. Завершить программу" + System.lineSeparator()
                        + "=== Завершение программы ===" + System.lineSeparator()
        );
    }

    @Test
    void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new MockInput(
                new String[] {"0", "Имя заявки", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new Create(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Имя заявки");
    }

    @Test
    void whenReplaceItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Изменить заявку"));
        String replacedName = "Новое имя заявки";
        Input in = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new Replace(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    @Test
    void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Удалить заявку"));
        Input in = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {
                new Delete(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    @Test
    void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[] {
                new Replace(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Редактирование заявки ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindAllAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("testOne"));
        Item two = tracker.add(new Item("testTwo"));
        Input in = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), "1",
                        "0", String.valueOf(two.getId()), "1"}
        );
        UserAction[] actions = new UserAction[] {
                new FindAll(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод всех заявок ===" + ln
                        + one + ln
                        + two + ln
                        + "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("testOne"));
        Item oneDuplicate = tracker.add(new Item("testOne"));
        Item two = tracker.add(new Item("testTwo"));
        Input in = new MockInput(
                new String[] {"0", one.getName(), "1",
                        "0", two.getName(), "1",
                        "0", oneDuplicate.getName(), "1"}
        );
        UserAction[] actions = new UserAction[] {
                new FindByName(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявок по имени ===" + ln
                        + one + ln
                        + oneDuplicate + ln
                        + "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenFindByIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("testOne"));
        Item oneDuplicate = tracker.add(new Item("testOne"));
        Item two = tracker.add(new Item("testTwo"));
        Input in = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), "1",
                        "0", String.valueOf(two.getName()), "1",
                        "0", String.valueOf(oneDuplicate.getName()), "1"}
        );
        UserAction[] actions = new UserAction[] {
                new FindById(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Поиск заявки по id ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    @Test
    void whenInvalidExit() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"1", "0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] userAction = new UserAction[] {
                new Exit(output)
        };
        new StartUI(output).init(input, tracker, userAction);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Завершить программу" + ln
                        + "Неверный ввод, вы можете выбрать: 0 .. 0" + ln
                        + "Меню:" + ln
                        + "0. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }
}