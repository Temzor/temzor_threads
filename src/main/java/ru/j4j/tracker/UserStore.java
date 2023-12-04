package ru.j4j.tracker;

import ru.j4j.tracker.model.User;

public class UserStore {
    public static void main(String[] args) {
        User user = new User(1, "user", "password");
        System.out.println(user);
    }
}
