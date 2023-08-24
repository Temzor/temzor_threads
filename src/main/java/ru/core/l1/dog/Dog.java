package ru.core.l1.dog;

public class Dog {
    private final String nickName;
    private final String breed;
    private final int speed;

    public Dog(String nickName, String breed, int speed) {
        this.nickName = nickName;
        this.breed = breed;
        this.speed = speed;
    }

    public void run() {
        for (int i = 0; i < speed; i++) {
            System.out.print("run...");
        }
        System.out.println();
    }

    public String info() {
        return nickName + " " + breed + " " + speed;
    }
}
