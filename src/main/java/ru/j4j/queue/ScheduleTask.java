package ru.j4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ScheduleTask {
    private final PriorityQueue<Task> queue;

    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    public void addTask(Task task) {
        queue.offer(task);
    }

    public Task readTask() {
        return queue.peek();
    }

    public Task getTask() {
        return queue.poll();
    }
}
