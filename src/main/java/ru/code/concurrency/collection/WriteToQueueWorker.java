package ru.code.concurrency.collection;

import java.util.concurrent.BlockingQueue;

public class WriteToQueueWorker implements Runnable {

    private final BlockingQueue<Integer> queue;

    public WriteToQueueWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            try {
                System.out.println("Put: " + counter);
                queue.put(counter++);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}