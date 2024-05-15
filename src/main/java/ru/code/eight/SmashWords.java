package ru.code.eight;

public class SmashWords {
    public static String smash(String... words) {
        StringBuilder smashed = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
                smashed.append(words[i]);
                break;
            }
            smashed.append(words[i]).append(" ");
        }
        return smashed.toString();
    }
}
