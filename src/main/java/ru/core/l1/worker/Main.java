package ru.core.l1.worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Petr", "Java developer", 350_000);
        System.out.println(worker.workerInfo(12));
    }
}
