package ru.core.l1.declaration;

public class Man {
    private final String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (this.age <= age) {
            this.age = age;
        } else {
            System.out.println("Operation decrease in age not permitted;");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Name: " + name + "\nage: " + age);
    }
}
