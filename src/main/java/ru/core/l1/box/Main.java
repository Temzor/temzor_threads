package ru.core.l1.box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10, 10, 10);
        BoxWeight boxWeight = new BoxWeight(7, 7, 7, 18.3);

        System.out.println(box.showInfo());
        System.out.println(boxWeight.showInfo());
    }
}
