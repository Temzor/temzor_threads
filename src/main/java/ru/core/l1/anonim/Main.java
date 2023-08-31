package ru.core.l1.anonim;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(() -> System.out.println("Cooking"));
    }
}
