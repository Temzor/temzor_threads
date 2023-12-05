package ru.j4j.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionUsage {
    public static void main(String[] args) {
        Collection<String> collectionExampleOne = new ArrayList<>();
        collectionExampleOne.add("one");
        collectionExampleOne.add("two");
        collectionExampleOne.add("three");
        Collection<String> list = new ArrayList<>();
        list.addAll(collectionExampleOne); /* or   Collection<String> list = new ArrayList<>(collectionExampleOne); */
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("Вывод содержимого коллекции после удаления из list");
        list.remove("two");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
