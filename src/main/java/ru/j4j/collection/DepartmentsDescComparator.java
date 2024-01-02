package ru.j4j.collection;

import java.util.Comparator;

public class DepartmentsDescComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] elements1 = o1.split("/", 2);
        String[] elements2 = o2.split("/", 2);
        int firstElementsCmp = elements2[0].compareTo(elements1[0]);
        if (firstElementsCmp != 0) {
            return firstElementsCmp;
        }
        String end1 = elements1.length > 1 ? elements1[1] : "";
        String end2 = elements2.length > 1 ? elements2[1] : "";
        return end1.compareTo(end2);
    }
}