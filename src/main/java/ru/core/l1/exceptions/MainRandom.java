package ru.core.l1.exceptions;

public class MainRandom {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100 + 10);
        System.out.format("Random int %s, please try again", random);
    }
}
