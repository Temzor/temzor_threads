package ru.j4j.assertj;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.ArrayList;

public class SimpleCollection<T> implements Iterable<T> {
    private final List<T> container;

    /**
     * Constructs a SimpleCollection with the provided elements.
     *
     * @param v0 the first element
     * @param v1 the second element
     * @param v2 the third element
     * @param v3 the fourth element
     * @param v4 the fifth element
     */
    public SimpleCollection(T v0, T v1, T v2, T v3, T v4) {
        container = new ArrayList<>(5);
        container.add(v0);
        container.add(v1);
        container.add(v2);
        container.add(v3);
        container.add(v4);
    }

    @Override
    public Iterator<T> iterator() {
        return new SimpleIterator();
    }

    private class SimpleIterator implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < container.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return container.get(index++);
        }
    }
}