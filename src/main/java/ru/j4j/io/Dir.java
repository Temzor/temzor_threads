package ru.j4j.io;

import java.io.File;
import java.util.Objects;

public class Dir {
    public static void main(String[] args) {
        File file = new File("c:\\projects");
        if (!file.exists()) {
            throw new IllegalArgumentException(String.format("Not exist %s", file.getAbsoluteFile()));
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(String.format("Not directory %s", file.getAbsoluteFile()));
        }
        System.out.printf("Size all files : %s%n", file.getTotalSpace() / 1073741824 + " GB");
        for (File subfile : Objects.requireNonNull(file.listFiles())) {
            System.out.println("name: " + subfile.getName() + " | size = " + subfile.length() / 1024 + " Kb");
        }
    }
}