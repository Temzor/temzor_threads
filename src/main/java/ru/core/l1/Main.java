package ru.core.l1;

public class Main {
    public static void main(String[] args) {
        Box firstBox = new Box();
        firstBox.setDimens(11, 14, 22.88);

        Box secondBox = new Box();
        secondBox.setDimens(1, 50.44, 88);

        Box thirdBox = new Box();
        thirdBox.setDimens(15, 15, 15);

        System.out.println(firstBox.volume());
        System.out.println(secondBox.volume());
        System.out.println(thirdBox.volume());
    }
}
