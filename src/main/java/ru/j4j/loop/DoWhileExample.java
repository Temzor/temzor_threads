package ru.j4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("Enter password: ");
            password = scanner.nextInt();
        } while (password != 555);
        System.out.println("Password enter is correct!");
    }
}

