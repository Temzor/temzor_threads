package ru.j4j.collection;

import java.util.Objects;

import static java.lang.Integer.compare;

public class User implements Comparable<User> {
    private final String name;

    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        if (this.name.compareTo(o.name) == 0) {
            return compare(age, o.age);
        }
        return name.compareTo(o.name) < 0 ? -1 : 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}