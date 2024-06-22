package ru.j4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор для обхода массива целых чисел в обратном порядке.
 */
public class BackwardArrayIterator implements Iterator<Integer> {
    private final int[] data;
    private int point;

    /**
     * Конструктор итератора.
     *
     * @param data массив целых чисел, который будет обходиться итератором.
     * @throws NullPointerException если переданный массив равен null.
     */
    public BackwardArrayIterator(int[] data) {
        if (data == null) {
            throw new NullPointerException("Массив не может быть null");
        }
        this.data = data;
        this.point = data.length - 1;
    }

    /**
     * Проверяет, есть ли следующий элемент для итерации.
     *
     * @return true, если есть следующий элемент, иначе false.
     */
    @Override
    public boolean hasNext() {
        return point >= 0;
    }

    /**
     * Возвращает следующий элемент в итерации.
     *
     * @return следующий элемент массива.
     * @throws NoSuchElementException если следующего элемента нет.
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Достигнут конец массива");
        }
        return data[point--];
    }
}