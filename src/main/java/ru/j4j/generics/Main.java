package ru.j4j.generics;

public class Main {
    public static void main(String[] args) {
        TupleTwice<Long, String> stringTupleTwice = new TupleTwice<>(15L, "Nick");
        TupleTwice<SuperClass, String> superClassStringTupleTwice = new TupleTwice<>(new SuperClass(), "Vas");
        TupleTriple<Long, String, Integer> tupleThrow = new TupleTriple<>(20L, "2", 6);
        System.out.println(tupleThrow.getMiddle());


    }

    private static class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }
}
