package ru.core.concurrency;

import java.io.*;

public class Buffered {
    public static void main(String[] args) {
        try (BufferedReader inputStream = new BufferedReader(new FileReader("data/input.txt"));
             BufferedWriter outputStream = new BufferedWriter(new FileWriter("data/output.txt", true))) {
            outputStream.write(inputStream.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
