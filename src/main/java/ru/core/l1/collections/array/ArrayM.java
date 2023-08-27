package ru.core.l1.collections.array;

import java.util.ArrayList;

public class ArrayM {
    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Sergey");
        employee.add("Masha");
        employee.add("Ura");
        employee.add("Nurik");
        employee.add("Murik");
        employee.remove("Masha");
        employee.remove(3);

        for (String name : employee) {
            System.out.println(name);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 1001; i++) {
            numbers.add(i);
        }

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println(sum);
    }
}
