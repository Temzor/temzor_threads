package ru.j4j.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListUsage {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add(1, "four");

        List<String> listAll = new ArrayList<>();
        listAll.add("four");
        listAll.add("five");
        strings.addAll(listAll);

        List<String> listAllIndex = new ArrayList<>();
        listAllIndex.add("six");
        listAllIndex.add("seven");
        strings.addAll(3, listAllIndex);

        List<String> listAllIndexForRemove = new ArrayList<>();
        listAllIndexForRemove.add("eight");
        listAllIndexForRemove.add("nine");
        strings.addAll(listAllIndexForRemove);

        for (String s : strings) {
            System.out.println("Element: " + s);
        }

        strings.set(1, "two and second");
        strings.remove(0);

        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Element: " + strings.get(i));
        }

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }

        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Текущий элемент: " + listIterator.next());
        }

        strings.remove("six");

        strings.removeAll(listAllIndexForRemove);

        strings.retainAll(listAllIndexForRemove);

        strings.replaceAll(String::toUpperCase);

        strings.removeIf(s -> s.length() <= 3);
    }
}
