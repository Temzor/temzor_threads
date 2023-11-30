package ru.j4j.poly;

public interface Transport {
    void drive();

    void passengers(int countPassengers);

    int price(int fillUp);
}
