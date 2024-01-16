package ru.j4j.generics;

public class MainBox {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(1);
        Integer i = box.getItem();
        System.out.println(i);
    }
}
