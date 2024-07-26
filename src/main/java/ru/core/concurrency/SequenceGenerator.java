package ru.core.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private final AtomicInteger counter = new AtomicInteger(0);

    public int generator() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return counter.incrementAndGet();
    }
}
