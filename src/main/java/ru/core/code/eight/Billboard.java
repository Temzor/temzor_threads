package ru.core.code.eight;

public class Billboard {
    public static int billboard(String name, int price) {
        char[] chars = name.toCharArray();
        return chars.length * price;
    }

    public static int billboard(String name) {
        char[] chars = name.toCharArray();
        return chars.length * 30;
    }
}
