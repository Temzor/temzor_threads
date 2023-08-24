package ru.core.l1.figure;

public class Main {
    public static void main(String[] args) {
        Rect firstRect = new Rect(18.12f, 23.68f);
        System.out.println("Perimeter rect: " + firstRect.perimeter());
        System.out.println("Square rect: " + firstRect.squareRect());
    }
}
