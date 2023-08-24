package ru.core.l1;

public class Main {
    public static void main(String[] args) {
        Box firstBox = new Box();
        firstBox.width = 15.6;
        firstBox.height = 10.7;
        firstBox.length = 12.3;

        Box secondBox = new Box();
        secondBox.width = 11.1;
        secondBox.height = 12.3;
        secondBox.length = 14.9;

        Box thirdBox = new Box();
        thirdBox.width = 12.13;
        thirdBox.height = 15.66;
        thirdBox.length = 26.93;

        System.out.println(firstBox.volume());
        System.out.println(secondBox.volume());
        System.out.println(thirdBox.volume());
    }
}
