package ru.code.concurrency.threadsintro;

public class IncrementTwoCountersSynchronizedOnObjectDemo {
    static Integer counter = 0;
    static Integer anotherCounter = 0;

    private static final Object COUNTER_LOCK = new Object();
    private static final Object ANOTHER_COUNTER_LOCK = new Object();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                incrementCounter();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                incrementAnotherCounter();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Counter: " + counter);
        System.out.println("Time elapsed: " + duration);
    }

    private static void incrementCounter() {
        synchronized (COUNTER_LOCK) {
            counter++;
        }
    }

    private static void incrementAnotherCounter() {
        synchronized (ANOTHER_COUNTER_LOCK) {
            anotherCounter++;
        }
    }
}

