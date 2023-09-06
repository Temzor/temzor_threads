package ru.core.l2.collections.linkedl;

import ru.core.l2.collections.arrayl.Car;
import ru.core.l2.collections.arrayl.CarList;

public class CArLinkedList implements CarList {
    private Node firstElement;
    private Node lastElement;
    private int size = 0;

    @Override
    public Car get(int index) {
        return null;
    }

    @Override
    public void add(Car car) {
        if (size == 0) {
            firstElement = new Node(null, car, null);
            lastElement = firstElement;
        } else {
            Node secondLast = lastElement;
            lastElement = new Node(secondLast, car, null);
            secondLast.next = lastElement;
        }
        size++;
    }

    @Override
    public void add(Car car, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(car);
            return;
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
    }

    @Override
    public boolean remove(Car car) {
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
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    private Node getNode(int index) {
        Node node = firstElement;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private static class Node {
        private Node previous;
        private Car value;
        private Node next;

        public Node(Node previous, Car value, Node next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }
}


