package ru.j4j.enumeration;

public enum Status {
    ACCEPTED("Принят"),
    IN_WORK("В работе"),
    WAITING("Ожидание"),
    FINISHED("Работы завершены");

    private final String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
