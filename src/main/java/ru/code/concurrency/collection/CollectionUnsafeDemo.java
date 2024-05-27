package ru.code.concurrency.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionUnsafeDemo {
    public static void main(String[] args) {
        List<Integer> threadUnsafeList = new ArrayList<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                threadUnsafeList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                threadUnsafeList.add(i);
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

        System.out.println("threadUnsafeList size: " + threadUnsafeList.size());
    }
}