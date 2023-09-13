package ru.core.l2.collections.hashmap;

import java.util.Objects;

public class CarOwner {
    private final int id;
    private String name;
    private final String lastName;

    public CarOwner(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarOwner carOwner = (CarOwner) o;
        return id == carOwner.id
                && Objects.equals(name, carOwner.name)
                && Objects.equals(lastName, carOwner.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }
}