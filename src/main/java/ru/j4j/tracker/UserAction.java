package ru.j4j.tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
