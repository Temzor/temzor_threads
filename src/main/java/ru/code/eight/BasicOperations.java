package ru.code.eight;

public class BasicOperations {
    public static Integer basicMath(String op, int x, int y) {
        return switch (op) {
            case "+" -> x + y;
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> 0;
        };
    }
}
