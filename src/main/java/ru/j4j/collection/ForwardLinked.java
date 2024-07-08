package ru.j4j.collection;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ForwardLinked<T> implements Iterable<T> {
    private int size;
    private int modCount;
    private Node<T> head;

    /**
     * Добавляет элемент в конец списка.
     *
     * @param value элемент для добавления
     */
    public void add(T value) {
        Objects.requireNonNull(value, "Value must not be null");
        Node<T> newNode = new Node<>(value, null);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        modCount++;
    }

    /**
     * Добавляет элемент в начало списка.
     *
     * @param value элемент для добавления
     */
    public void addFirst(T value) {
        Objects.requireNonNull(value, "Value must not be null");
        Node<T> newNode = new Node<>(value, head);
        head = newNode;
        size++;
        modCount++;
    }

    /**
     * Возвращает элемент по указанному индексу.
     *
     * @param index индекс элемента
     * @return элемент по указанному индексу
     */
    public T get(int index) {
        Objects.checkIndex(index, size);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    /**
     * Удаляет первый элемент из списка.
     *
     * @return удаленный элемент
     */
    public T deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        Node<T> current = head;
        head = head.next;
        current.next = null;
        size--;
        modCount++;
        return current.item;
    }

    /**
     * Удаляет последний элемент из списка.
     *
     * @return удаленный элемент
     */
    public T deleteLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        if (head.next == null) {
            return deleteFirst();
        }
        Node<T> current = head;
        Node<T> prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        size--;
        modCount++;
        return current.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> current = head;
            private final int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
                return current != null;
            }

            @Override
            public T next() {
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T value = current.item;
                current = current.next;
                return value;
            }
        };
    }

    private static class Node<T> {
        private final T item;
        private Node<T> next;

        Node(T element, Node<T> next) {
            this.item = element;
            this.next = next;
        }
    }
}