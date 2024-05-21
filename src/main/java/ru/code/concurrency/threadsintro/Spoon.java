package ru.code.concurrency.threadsintro;

import lombok.Getter;

@Getter
class Spoon {
    private Eater owner;

    public Spoon(Eater d) {
        owner = d;
    }

    public synchronized void setOwner(Eater d) {
        owner = d;
    }

    public synchronized void use() {
        System.out.printf("%s has eaten!", owner.getName());
    }
}