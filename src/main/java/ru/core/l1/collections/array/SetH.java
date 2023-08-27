package ru.core.l1.collections.array;

import java.util.ArrayList;
import java.util.Random;

public class SetH {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<String> concatStringArrayList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            integerArrayList.add(i);
        }

        for (int i = 0; i < 10; i++) {
            stringArrayList.add(Long.toHexString(Double.doubleToLongBits(Math.random())));
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            concatStringArrayList.add(integerArrayList.get(i) + " - " + stringArrayList.get(i));
        }


        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }

        for (String s : stringArrayList) {
            System.out.println(s);
        }

        for (String string : concatStringArrayList) {
            System.out.println(string);
        }

    }
}
