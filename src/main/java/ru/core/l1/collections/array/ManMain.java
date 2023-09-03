package ru.core.l1.collections.array;

public class ManMain {
    public static void main(String[] args) {
        String person = "This is Goga, hi is 36 y.o., hi is height 186 sm. Position - \"Strong Man\"";
        Man man = new Man(person.substring(8, 12), person.substring(63, 73), Integer.parseInt(person.substring(20, 22)),
                Integer.parseInt(person.substring(42, 45)));
        System.out.println(man);
    }

}
