package ru.core.l1;

public class Main {
    public static void main(String[] args) {
        Box firstBox = new Box();
        firstBox.setDimens(11, 14, 22.88);

        Box secondBox = new Box();
        secondBox.setDimens(1, 50.44, 88);


        switch (secondBox.compare(secondBox)) {
            case -1 -> System.out.println("Second box is bigger.");
            case 0 -> System.out.println("First and second boxes is even.");
            case 1 -> System.out.println("First box is bigger.");
            default -> System.out.println("Nit impedance value");
        }
    }
}
