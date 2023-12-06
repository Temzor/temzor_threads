package ru.j4j.search;

public class Person {
    private String name;
    private final String surName;
    private final String phone;
    private final String address;

    public Person(String name, String surName, String phone, String address) {
        this.name = name;
        this.surName = surName;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return String.format("Person(name=%s ,surName=%s ,phone=%s ,address=%s)",
                this.name,
                this.surName,
                this.phone,
                this.address);
    }
}
