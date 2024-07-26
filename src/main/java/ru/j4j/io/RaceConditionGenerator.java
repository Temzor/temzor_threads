package ru.j4j.io;

import ru.core.concurrency.SequenceGenerator;

public class RaceConditionGenerator {
    public static void main(String[] args) {
        SequenceGenerator seq = new SequenceGenerator();
        for (int i = 0; i < 50; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName() + " " + seq.generator())).start();
        }
    }
}
