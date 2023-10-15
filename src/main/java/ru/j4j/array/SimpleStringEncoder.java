package ru.j4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.append(symbol).append(counter);
                symbol = input.charAt(counter);
            }
        }
        return result.toString();
    }
}
