package ru.j4j.generics;

import lombok.Getter;

@Getter
public class User extends Base {
    private final String username;

    public User(String id, String username) {
        super(id);
        this.username = username;
    }
}
