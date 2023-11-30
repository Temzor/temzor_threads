package ru.j4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 3 || matches < 0) {
                System.out.println("Можно брать только 1,2 или 3 спички");
                turn = !turn;
            } else if (count < matches) {
                System.out.println("Остаток спичек меньше введенного числа");
                turn = !turn;
            } else {
                count -= matches;
                System.out.printf("Спичек осталось: %d\n", count);
            }

        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
