package ru.j4j.oop;

public class Petya {
    public static void main(String[] args) {
        Student petya = new Student("Petya", "Petrov",
                19, 2, "Progressive management");

        petya.music();
        petya.sing();
        System.out.println(petya);

    }
}
