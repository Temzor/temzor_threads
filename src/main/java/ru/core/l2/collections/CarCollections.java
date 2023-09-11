package ru.core.l2.collections;

import ru.core.l2.collections.arrayl.Car;

public interface CarCollections extends Iterable<Car> {
    boolean add(Car car);

    boolean remove(Car car);

    int size();

    void clear();

    boolean contains(Car car);
}
