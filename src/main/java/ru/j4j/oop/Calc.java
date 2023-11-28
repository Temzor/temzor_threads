package ru.j4j.oop;

public class Calc {

    public static class Multiple {

        private final int rsl;

        public Multiple(int number) {
            rsl = number;
        }

        public int getResult() {
            return rsl;
        }

    }

    public static Multiple getMult(int value) {
        int result = value * value;
        return new Multiple(result);
    }

    public static void main(String[] args) {
        Calc.Multiple mult = Calc.getMult(3);
        System.out.println("Квадрат числа равен " + mult.getResult());
    }
}
