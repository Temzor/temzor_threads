package ru.j4j.concurrent;


public class ThreadStop {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> {
            int counter = 0;
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(counter++);
            }
        });
        first.start();
        Thread.sleep(1000);
        first.interrupt();
    }
}
