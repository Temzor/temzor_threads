package ru.core.l1.threads;

public class Main {
    public static void main(String[] args) {
        RunnableTimer runnableTimer = new RunnableTimer();
        Thread thread = new Thread(runnableTimer);
        thread.start();

        RunnableTimer runnableTimer2 = new RunnableTimer();
        Thread thread2 = new Thread(runnableTimer2);
        thread2.start();
    }
}
