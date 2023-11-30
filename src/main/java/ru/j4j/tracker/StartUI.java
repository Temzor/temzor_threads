package ru.j4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("Пользователь выбрал: " + select);
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
        boolean run = true;
    }
}

