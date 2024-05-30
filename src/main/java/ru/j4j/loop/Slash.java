package ru.j4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row % 2 == 0 && cell % 2 == 0 || row % 2 == 1 && cell % 2 == 1;
                boolean right = false;
                if (left) {
                    System.out.print("l");
                } else if (right) {
                    System.out.print("r");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
    }
}