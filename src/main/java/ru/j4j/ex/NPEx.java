package ru.j4j.ex;

public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Petr Arsentev";
        for (String el : shops) {
            if (el != null) {
                System.out.println(el + " has a size : " + el.length());
            }
        }
    }
}
