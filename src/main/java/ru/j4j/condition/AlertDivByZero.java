package ru.j4j.condition;

public class AlertDivByZero {
    public static String possibleDiv(int number) {
        if (number == 0) {
            return "Could not div by 0.";
        } else if (number < 0) {
            return "This is negative number";
        } else {
            return "This is positive number";
        }
    }
}
