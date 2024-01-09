package ru.j4j.stream;

import java.util.List;

/**
 * @param name     - it's name students
 * @param subjects - it massive subjects, which subjects study
 */

public record Pupil(String name, List<Subject> subjects) {
}
