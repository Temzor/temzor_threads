package ru.j4j.tracker;

import java.util.StringJoiner;

public record PersonRecord(String name, int age) {
    @Override
    public String toString() {
        return new StringJoiner(", ", PersonRecord.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
