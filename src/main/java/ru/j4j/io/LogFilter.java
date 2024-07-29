package ru.j4j.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogFilter {
    private final Path logFilePath;

    public LogFilter(String file) {
        this.logFilePath = Paths.get(file);
    }

    public List<String> filter(String statusCode) {
        List<String> result = new ArrayList<>();
        try (BufferedReader input = Files.newBufferedReader(logFilePath)) {
            String line;
            while ((line = input.readLine()) != null) {
                String[] logs = line.split(" ");
                if (statusCode.equals(logs[logs.length - 2])) {
                    result.add(line);
                }
            }
        } catch (IOException e) {
            logError(e);
        }
        return result;
    }

    public void saveTo(String out, String statusCode) {
        List<String> data = filter(statusCode);
        try (PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("out.txt")))) {
            data.forEach(pw::println);
        } catch (IOException err) {
            logError(err);
        }
    }

    private void logError(Exception e) {
        System.err.println("Error: " + e.getMessage());
    }

    public static void main(String[] args) {
        LogFilter logFilter = new LogFilter("data/log.txt");
        logFilter.filter("404").forEach(System.out::println);
        logFilter.saveTo("data/404.txt", "404");
    }
}
