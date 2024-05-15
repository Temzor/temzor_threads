package ru.code.eight;

public class Month {
    public static String howMonth(int monthNumber) {
        return switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Unknown";
        };
    }

    public static void main(String[] args) {
       for (int month = 1; month <= 12; month++) {
           System.out.println(howMonth(month));
       }
    }
}
