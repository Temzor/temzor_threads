package ru.j4j.inheritance;

public class JSONReport {
    public String generate(String name, String body) {
        String ln = System.lineSeparator();
        return String.format("{" + ln
                + "\t\"name\" : \"%s\"," + ln
                + "\t\"body\" : \"%s\"" + ln
                + "}", name, body);
    }
}
