package ru.j4j.format;

public class Format {
    public static void getGreeting(String name) {
        System.out.printf("Привет! Я %s%n", name);
    }

    public static void main(String[] args) {
        getGreeting("Елена");
    }
}
