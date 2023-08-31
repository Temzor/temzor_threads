package ru.core.l1.exceptions;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        int a = 0;
        try {
            int b = 7 / a;
            String s = "123qwe";
            int i = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finnaly block");
        }

        System.out.println("Hello");
    }
}
