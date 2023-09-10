package ru.core.l2.collections.set;

import ru.core.l2.collections.arrayl.Car;

public interface CarSet {
    boolean add(Car car);
    boolean remove(Car car);
    int size();
    void clear();

}
