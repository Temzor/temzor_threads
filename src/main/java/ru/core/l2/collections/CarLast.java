package ru.core.l2.collections;

import java.util.Arrays;

public class CarLast implements CarList {
    private Car[] arrayCar = new Car[10];
    private int size = 0;


    @Override
    public Car get(int index) {
        checkIndex(index);
        return arrayCar[index];
    }

    @Override
    public void add(Car car) {
        if (size >= arrayCar.length) {
            arrayCar = Arrays.copyOf(arrayCar, arrayCar.length * 2);
        }
        arrayCar[size] = car;
        size++;
    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size; i++) {
            if (arrayCar[i].equals(car)) {
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        checkIndex(index);
        for (int i = index; i < size; i++) {
            arrayCar[i] = arrayCar[i + 1];
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        arrayCar = new Car[10];
        size = 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
