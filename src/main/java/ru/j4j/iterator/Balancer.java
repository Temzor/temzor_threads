package ru.j4j.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Balancer {
    public static void split(List<ArrayList<Integer>> nodes, Iterator<Integer> source) {
        int index = 0;
        while (source.hasNext()) {
            List<Integer> list = nodes.get(index);
            list.add(source.next());
            index++;
            if (index == nodes.size()) {
                index = 0;
            }
        }
    }
}
