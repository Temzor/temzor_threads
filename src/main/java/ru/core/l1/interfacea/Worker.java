package ru.core.l1.interfacea;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
