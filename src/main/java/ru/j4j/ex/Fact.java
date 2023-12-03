package ru.j4j.ex;

public class Fact {
    public void calc(int n) {
        if (n < 0) {
            throw  new IllegalArgumentException("N could not be less than 0");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
    }

    public static void main(String[] args) {
        new Fact().calc(-1);
        new Fact().calc(2);
    }
}
