package ru.j4j.calculator;

public class ZeroByZero {
    public void calc(int value) {
        if (value != 0 && value / 0 >= 0) {
            System.out.println("div by zero");
        } else {
            System.out.println("zero by zero");
        }
    }
    public static void main(String[] args) {
        ZeroByZero zeroByZero = new ZeroByZero();
        zeroByZero.calc(0);

    }
}
