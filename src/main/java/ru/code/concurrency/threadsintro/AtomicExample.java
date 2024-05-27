package ru.code.concurrency.threadsintro;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private static final AtomicInteger ATOMIC_INTEGER = new AtomicInteger(0);

    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                ATOMIC_INTEGER.incrementAndGet();
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final value: " + ATOMIC_INTEGER.get());
    }
}
