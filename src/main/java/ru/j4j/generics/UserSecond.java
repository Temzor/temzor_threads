package ru.j4j.generics;

import lombok.Getter;


@Getter
public class UserSecond extends BaseSecond {
    private final String username;

    public UserSecond(String id, String username) {
        super(id);
        this.username = username;
    }
}
