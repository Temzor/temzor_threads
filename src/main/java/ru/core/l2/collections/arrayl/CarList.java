package ru.core.l2.collections.arrayl;

import ru.core.l2.collections.CarCollections;

public interface CarList extends CarCollections {
    Car get(int index);

    boolean add(Car car);

    boolean add(Car car, int index);

    boolean remove(Car car);

    boolean removeAt(int index);

    int size();

    void clear();

    boolean contains(Car car);

}
