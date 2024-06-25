package ru.j4j.iterator;

import java.util.Iterator;
import java.util.List;

public class Balancer {

    /**
     * Разделяет элементы из источника по спискам узлов циклически.
     *
     * @param nodes список списков для распределения элементов
     * @param source итератор источника элементов
     * @throws IllegalArgumentException если nodes или source равны null, или nodes пуст
     */
    public static void split(List<List<Integer>> nodes, Iterator<Integer> source) {
        if (nodes == null || source == null) {
            throw new IllegalArgumentException("Nodes and source must not be null");
        }
        if (nodes.isEmpty()) {
            throw new IllegalArgumentException("Nodes list must not be empty");
        }

        int index = 0;
        while (source.hasNext()) {
            List<Integer> list = nodes.get(index);
            list.add(source.next());
            index = (index + 1) % nodes.size();
        }
    }
}