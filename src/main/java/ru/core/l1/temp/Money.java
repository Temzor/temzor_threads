package ru.core.l1.temp;

public class Money {
    public static void main(String[] args) {
        int money = 750;
        if (money > 500) {
            System.out.println("Buy pizza");
        } else if (money < 100) {
            System.out.println("Buy lunch");
        } else {
            System.out.println("Buy cola");
        }
    }
}
