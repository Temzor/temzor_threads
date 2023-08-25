package ru.core.l1.declaration;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Vanya", 27);
        man.setAge(28);
        man.showInfo();
        System.out.println(man.getAge());
        System.out.println(man.getName());
    }
}
