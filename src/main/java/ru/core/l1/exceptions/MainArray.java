package ru.core.l1.exceptions;

@SuppressWarnings("ALL")
public class MainArray {
    public static void main(String[] args) {
        var ints = new int[1];
        try {
            ints[3] = 5;
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println(i);
        } finally {
            assert System.out != null;
            System.out.println();
        }
    }
}
