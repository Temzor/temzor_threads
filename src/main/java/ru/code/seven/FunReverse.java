package ru.code.seven;


public class FunReverse {
    public static String funReverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(0, i) + new StringBuilder(s.substring(i)).reverse();
        }
        return s;
    }
}
