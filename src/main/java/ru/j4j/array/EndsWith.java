package ru.j4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        for (int i = 0; i < postfix.length - 1; i++) {
            if (word[word.length - i - 1] != postfix[postfix.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}