package ru.code.concurrency.collection;

import java.util.concurrent.BlockingQueue;

public class ReadFromQueueWorker implements Runnable {

    private final BlockingQueue<Integer> queue;

    public ReadFromQueueWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int counter = queue.take();
                System.out.println("Take: " + counter);
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}