package ru.j4j.generics;

public class Main {
    public static void main(String[] args) {
        TupleTwice<Long, String> stringTupleTwice = new TupleTwice<>(15L, "Nick");
        TupleTwice<SuperClass, String> superClassStringTupleTwice = new TupleTwice<>(new SuperClass(), "Vas");
        System.out.println(stringTupleTwice.getLeft() + 21L);


    }

    private static class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }
}
