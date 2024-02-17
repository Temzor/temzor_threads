package ru.j4j.generics;

import java.util.HashMap;
import java.util.Map;

public class MemSoreSecond<T extends BaseSecond> implements StoreSecond {
    private Map<String, T> storage = new HashMap<>();

    @Override
    public void add(BaseSecond model) {

    }

    @Override
    public boolean replace(String id, BaseSecond model) {
        return false;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public BaseSecond findById(String id) {
        return null;
    }
}
