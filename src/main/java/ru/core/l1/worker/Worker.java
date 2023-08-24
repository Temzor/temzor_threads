package ru.core.l1.worker;

public class Worker {
    private final String name;
    private final String pleased;
    private final int salary;

    public Worker(String name, String pleased, int salary) {
        this.name = name;
        this.pleased = pleased;
        this.salary = salary;
    }

    public String workerInfo(int monthCounter) {
        return "Name: " + name + ", Pleased: " + pleased + ", Salary: " + salary + ", Sum salary in the " + monthCounter
                + " month: " + salary * monthCounter;

    }
}
