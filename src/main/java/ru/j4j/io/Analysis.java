package ru.j4j.io;

import java.io.*;

public class Analysis {
    public void unavailable(String source, String target) {
        try (PrintWriter output = new PrintWriter(new FileOutputStream(target));
             BufferedReader reader = new BufferedReader(new FileReader(source))) {

            String line;
            boolean isAvailable = true;

            while ((line = reader.readLine()) != null) {
                if (isAvailable && (line.startsWith("400") || line.startsWith("500"))) {
                    output.write(line.substring(4) + ";");
                    isAvailable = false;
                } else if (!isAvailable && !(line.startsWith("400") || line.startsWith("500"))) {
                    output.write(line.substring(4) + System.lineSeparator());
                    isAvailable = true;
                }
            }

        } catch (IOException e) {
            System.err.println("Ошибка при обработке файлов: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Analysis analysis = new Analysis();
        analysis.unavailable("data/server.log", "data/target.csv");
    }
}
