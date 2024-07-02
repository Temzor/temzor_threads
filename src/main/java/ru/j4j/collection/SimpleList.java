package ru.j4j.collection;

public interface SimpleList<T> extends Iterable<T> {
    void add(T value);

    T remove(int index);

    T set(int index, T newValue);

    T get(int index);

    int size();
}
