package ru.j4j.queue;

public record Task(Position position,
                   String description,
                   int urgency) {
}
