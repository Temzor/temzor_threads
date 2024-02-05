package ru.code.seven;

public class DingleMouse {
    public static long[] clonewars(int kataPerDay) {
        return new long[] {
                (long) Math.ceil(Math.pow(2, kataPerDay - 1)),
                (long) Math.pow(2, kataPerDay + 1) - kataPerDay - 2
        };
    }
}
