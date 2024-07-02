package ru.j4j.collection;

import java.util.*;

public class SimpleArrayList<T> implements SimpleList<T> {
    private T[] container;
    private int size;
    private int modCount;

    public SimpleArrayList(int capacity) {
        container = (T[]) new Object[capacity];
    }

    private void grow() {
        int newLength = container.length > 0 ? container.length * 2 : 1;
        container = Arrays.copyOf(container, newLength);
    }

    @Override
    public void add(T value) {
        if (size == container.length) {
            grow();
        }
        container[size++] = value;
        modCount++;
    }

    @Override
    public T remove(int index) {
        T removedValue = get(index);
        System.arraycopy(container, index + 1, container, index, size - index - 1);
        size--;
        modCount++;
        return removedValue;
    }

    @Override
    public T set(int index, T newValue) {
        T changedValue = get(index);
        container[index] = newValue;
        return changedValue;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return container[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;
            public final int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException("cannot be changed during iteration");
                }
                return index < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("collection doesn't have the following element");
                }
                return container[index++];
            }
        };
    }
}