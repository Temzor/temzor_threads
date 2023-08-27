package ru.core.l1.temp;

public class Weather {
    public static void main(String[] args) {
        boolean isNight = false;
        boolean isGoodWeather = true;
        if (isNight) {
            System.out.println("Sleeping");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("Go to the walk");
        }
        if (!isNight && isGoodWeather) {
            System.out.println("Read the book");
        }
    }
}

