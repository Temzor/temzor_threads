package ru.core.l2.collections.set;

import ru.core.l2.collections.CarCollections;
import ru.core.l2.collections.arrayl.Car;

public interface CarSet extends CarCollections {
    boolean add(Car car);
    boolean remove(Car car);
    int size();
    void clear();
}
