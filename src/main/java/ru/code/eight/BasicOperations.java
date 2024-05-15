package ru.code.eight;

public class BasicOperations {
    public static Integer basicMath(String op, int x, int y) {
        switch (op) {
            case "+" -> {
                return x + y;
            }
            case "-" -> {
                return x - y;
            }
            case "*" -> {
                return x * y;
            }
            case "/" -> {
                return x / y;
            }
            default -> {
                return 0;
            }
        }
    }
}
