package ru.j4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Создание новой заявки ===");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Вывод всех заявок ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Изменение названия заявки ===");
                System.out.println("Введите id заявки:");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Введите новое название заявки:");
                Item item = new Item(scanner.nextLine());
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select == 3) {
                System.out.println("=== Удаление заявки ===");
                System.out.println("Введите id заявки:");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                tracker.delete(id);
                System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
            } else if (select == 4) {
                System.out.println("=== Поиск заявки по id ===");
                System.out.println("Введите id заявки:");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                System.out.println(item != null ? item : "Заявки с введенным id: " + id + " не существует");
            } else if (select == 5) {
                System.out.println("=== Вывод заявок по имени ===");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем: " + name + " не найдены.");
                }
            } else {
                run = false;
            }
        }

    }


    private void showMenu() {
        MenuEnum[] status = MenuEnum.values();
        System.out.println("Меню:");
        for (MenuEnum s : status) {
            System.out.printf("%d. %s\n", s.ordinal(), s.getInfo());

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}

