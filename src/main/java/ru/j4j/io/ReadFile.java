package ru.j4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("data/input.txt");
             BufferedReader input = new BufferedReader(reader)) {
            StringBuilder text = new StringBuilder();
            input.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}