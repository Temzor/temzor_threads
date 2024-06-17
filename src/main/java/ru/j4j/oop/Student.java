package ru.j4j.oop;

public class Student {
    public void music(String lyric) {
        System.out.println("I can sing a sound of " + lyric);
    }

    public void sing() {
        System.out.println("I believe in Java");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.sing();
        petya.music("Rammstein");
        String song = "I believe, I can fly";
        petya.music(song);
    }
}
