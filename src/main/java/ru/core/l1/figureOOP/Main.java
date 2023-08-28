package ru.core.l1.figureOOP;

public class Main {
    public static void main(String[] args) {
        Rect firstRect = new Rect(15);
        Rect secondRect = new Rect(10, 12);
        Triangle firstTriangle = new Triangle(20);
        Triangle secondTriangle = new Triangle(15, 12, 10);

        System.out.println(firstRect.area());
        System.out.println(secondRect.area());
        System.out.println(firstTriangle.area());
        System.out.println(secondTriangle.area());
    }
}
