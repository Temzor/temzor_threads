package ru.j4j.generics;

import java.util.HashMap;
import java.util.Map;

public class MemSoreSecond<T extends BaseSecond> implements StoreSecond<T> {
    private Map<String, T> storage = new HashMap<>();

    @Override
    public void add(T model) {
        if (!storage.containsKey(model.getId())) {
            storage.put(model.getId(), model);
        }
    }

    @Override
    public boolean replace(String id, T model) {
        return storage.replace(id, model) != null;
    }

    @Override
    public void delete(String id) {
        storage.remove(id);

    }

    @Override
    public T findById(String id) {
        return storage.get(id);
    }
}
