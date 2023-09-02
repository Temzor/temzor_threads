package ru.core.l1.threads;

public class Main {
    public static void main(String[] args) {
        RunnableTimer runnableTimer = new RunnableTimer();
        Thread thread = new Thread(runnableTimer);
        thread.start();

    }
}
