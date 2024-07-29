package ru.j4j.io;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

public class AnalysisTest {
    @Test
    void whenOneNonWorkingTime(@TempDir Path tempDir) throws IOException {
        File source = tempDir.resolve("source.txt").toFile();
        try (PrintWriter printWriter = new PrintWriter(source)) {
            printWriter.println("200 10:56:01");
            printWriter.println("500 10:57:01");
            printWriter.println("400 10:58:01");
            printWriter.println("500 10:59:01");
            printWriter.println("400 11:01:02");
            printWriter.println("300 11:02:02");
        }
        File target = tempDir.resolve("target.txt").toFile();
        Analysis analysis = new Analysis();
        analysis.unavailable(source.getAbsolutePath(), target.getAbsolutePath());
        StringBuilder result = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(target))) {
            bufferedReader.lines().forEach(result::append);
        }
        assertThat("10:57:01;11:02:02").hasToString(result.toString());
    }

    @Test
    void whenTwoNonWorkingTime(@TempDir Path tempDir) throws IOException {
        File source = tempDir.resolve("source.txt").toFile();
        try (PrintWriter printWriter = new PrintWriter(source)) {
            printWriter.println("200 10:56:01");
            printWriter.println("500 10:57:01");
            printWriter.println("400 10:58:01");
            printWriter.println("300 10:59:01");
            printWriter.println("500 11:01:02");
            printWriter.println("200 11:02:02");
        }
        File target = tempDir.resolve("target.txt").toFile();
        Analysis analysis = new Analysis();
        analysis.unavailable(source.getAbsolutePath(), target.getAbsolutePath());
        StringBuilder result = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(target))) {
            bufferedReader.lines().forEach(result::append);
        }
        assertThat("10:57:01;10:59:0111:01:02;11:02:02").hasToString(result.toString());
    }
}