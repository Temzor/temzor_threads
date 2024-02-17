package ru.j4j.generics;

public interface StoreSecond<T extends BaseSecond> {
    void add(T model);

    boolean replace(String id, T model);

    void delete(String id);

    T findById(String id);
}
