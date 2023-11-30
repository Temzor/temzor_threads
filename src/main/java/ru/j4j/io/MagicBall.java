package ru.j4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = new Random().nextInt(3);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        scanner.nextLine();
        switch (answer) {
            case 0 -> System.out.println("Yes");
            case 1 -> System.out.println("No");
            case 2 -> System.out.println("Maybe");
            default -> System.out.println("I don't know");
        }
    }
}
