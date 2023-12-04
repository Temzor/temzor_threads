package ru.j4j.tracker.action;

import ru.j4j.tracker.input.Input;
import ru.j4j.tracker.Tracker;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
