package ru.j4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class College {

    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Optional<Student> findByAccount(String account) {
        return Optional.ofNullable(students.keySet()
                .stream()
                .filter(student -> student.account().equals(account))
                .findFirst()
                .orElse(null));
    }
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Student> student = findByAccount(account);
        if (student.isPresent()) {
            return Optional.ofNullable(students.get(student.get())
                    .stream()
                    .filter(s -> s.name().equals(name))
                    .findFirst()
                    .orElse(null));
        }
        return Optional.empty();
    }
}
