package ru.core.l1.temp;

public class Days {
    public static void main(String[] args) {
        int days = 5000;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - (years * 365) - (month * 31);
        System.out.println("In " + days + " days: \nyears " + years + "\nmonth " + month + "\ndays " + leftDays);
    }
}
