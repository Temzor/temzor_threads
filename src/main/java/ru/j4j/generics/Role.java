package ru.j4j.generics;

import lombok.Getter;

@Getter
public class Role extends Base {
    private final String roleName;

    public Role(String id, String username) {
        super(id);
        this.roleName = username;
    }
}
