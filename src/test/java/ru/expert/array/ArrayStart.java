package ru.expert.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayStart {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i + 1);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
