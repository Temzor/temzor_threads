package ru.core.l1;

public class Seconds {
    public static void main(String[] args) {
        int seconds = 18985876;
        int days = seconds / 86400;
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds % 86400) % 3600) / 60;
        int secondLeft = seconds - (days * 86400) - (hours * 3600) - (minutes * 60);

        System.out.println("In seconds " + seconds + ": \ndays " + days + "\nhours " + hours + "\nminutes " + minutes
        + "\nseconds: " + secondLeft);
    }
}

