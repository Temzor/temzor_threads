package ru.core.l1.collections.array;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionsMain {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Vasya");
        stringHashSet.add("Gena");
        stringHashSet.add("Tanya");
        stringHashSet.add("Vasya");

        for (String s : stringHashSet) {
            System.out.println(s);
        }

        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Vasya");
        stringTreeSet.add("Gena");
        stringTreeSet.add("Tanya");
        stringTreeSet.add("Vasya");

        for (String s : stringHashSet) {
            System.out.println(s);
        }
    }
}
