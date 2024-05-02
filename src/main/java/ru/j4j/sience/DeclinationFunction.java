package ru.j4j.sience;

public class DeclinationFunction {
    public static void declination(int number) {
        System.out.printf("%d  компьютер%s\n", number, number == 1 ? "" : number > 0 && number < 5 ? "а" : "ов");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            declination(i);
        }
    }
}
