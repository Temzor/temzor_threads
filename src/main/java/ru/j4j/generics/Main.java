package ru.j4j.generics;

public class Main {
    public static void main(String[] args) {
        final Tuple studentFirst = new Tuple(1, "Niki");
        final String name = studentFirst.getRight().toString();
        final String nameNext = (String) studentFirst.getRight();
        final String nameMistakes = (String) studentFirst.getLeft();
        System.out.println(nameMistakes);
    }
}
