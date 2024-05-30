package ru.j4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        if (number % 6 == 0) {
            return "The number divides by 6.";
        } else if (number % 3 == 0) {
            return "The number divides by 3, but it isn't the even number.";
        } else if (number % 2 == 0) {
            return "The number doesn't divide by 3, but it is the even number.";
        } else {
            return "The number doesn't divide by 3 and it isn't the even number.";
        }
    }
}