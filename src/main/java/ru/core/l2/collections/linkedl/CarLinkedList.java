package ru.core.l2.collections.linkedl;

import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.arrayl.CarList;

import java.util.Iterator;

public class CarLinkedList implements CarList {
    private Node firstElement;
    private Node lastElement;
    private int size = 0;

    @Override
    public Car get(int index) {
        return getNode(index).value;
    }

    @Override
    public boolean add(Car car) {
        if (size == 0) {
            firstElement = new Node(null, car, null);
            lastElement = firstElement;
        } else {
            Node secondLast = lastElement;
            lastElement = new Node(secondLast, car, null);
            secondLast.next = lastElement;
        }
        size++;
        return true;
    }

    @Override
    public boolean add(Car car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            return add(car);
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, car, nodeNext);
        nodeNext.previous = newNode;
        if (nodePrevious != null) {
            nodePrevious.next = newNode;
        } else {
            firstElement = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Car car) {
        int index = findElement(car);
        if (index != 1) {
            removeAt(index);
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;
        if (nodeNext != null) {
            nodeNext.previous = nodePrevious;
        } else {
            lastElement = nodePrevious;
        }
        if (nodePrevious != null) {
            nodePrevious.next = nodeNext;
        } else {
            firstElement = nodeNext;
        }
        size--;
        return true;
    }

    @Override
    public boolean contains(Car car) {
        return findElement(car) != -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        firstElement = null;
        lastElement = null;
        size = 0;
    }

    private Node getNode(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = firstElement;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private int findElement(Car car) {
        Node node = firstElement;
        for (int i = 0; i < size; i++) {
            if (node.value.equals(car)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Car> iterator() {
        return new Iterator<>() {
            private Node node = firstElement;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Car next() {
                Car car = node.value;
                node = node.next;
                return car;
            }
        };
    }

    private static class Node {
        private Node previous;
        private final Car value;
        private Node next;

        public Node(Node previous, Car value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}


