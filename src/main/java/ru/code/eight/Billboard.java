package ru.code.eight;

public class Billboard {
    public static int billboard(String name, int price) {
        return name.repeat(price).length();
    }

    public static int billboard(String name) {
        return name.repeat(30).length();
    }
}
