package ru.core.l2.collections.hashmap;

import ru.core.l2.collections.arrayl.Car;

import java.util.List;
import java.util.Set;

public interface CarHashMap {
    void put(CarOwner key, Car value);

    Car get(CarOwner key);

    Set<CarOwner> keySet();

    List<Car> values();

    boolean remove(CarOwner key);

    int size();

    void clear();
}
