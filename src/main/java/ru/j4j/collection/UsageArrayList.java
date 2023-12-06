package ru.j4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dmitrii");
        arrayList.add("Ivan");
        arrayList.add("Pert");

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
