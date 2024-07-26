package ru.core.concurrency;

public class AnonymThread {
    public static void main(String[] args) {
        Thread catThread = new Thread(
                () -> System.out.println("Thread #1 start")
        );
        catThread.setName("catThread");
        System.out.println(catThread.getName());
        catThread.start();
    }
}
