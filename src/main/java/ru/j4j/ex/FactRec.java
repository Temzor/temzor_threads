package ru.j4j.ex;

public class FactRec {
    public static int calc(int n) {
        return n == 0 || n == 1 ? 1 : calc(n - 1) * n;
    }

    public static void main(String[] args) {
        int result = calc(3);
        System.out.println(result);
    }
}
