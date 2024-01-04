package ru.j4j.finder.model;

import lombok.Getter;

@Getter
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

    @Override
    public String toString() {
        return String.format("Person(name=%s ,surName=%s ,phone=%s ,address=%s)",
                this.name,
                this.surName,
                this.phone,
                this.address);
    }
}
