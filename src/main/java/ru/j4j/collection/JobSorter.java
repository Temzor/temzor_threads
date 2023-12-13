package ru.j4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobDescByName()
                .thenComparing(new JobDescByPriority())
                .thenComparing(new JobDescByNameLength()));
        System.out.println(jobs);
    }
}
