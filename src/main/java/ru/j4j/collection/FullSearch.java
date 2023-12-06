package ru.j4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public Set<String> extractNumber(List<Task> taskList) {
        Set<String> strings = new HashSet<>();
        for (Task task : taskList) {
            strings.add(task.getNumber());
        }

        return strings;
    }
}
