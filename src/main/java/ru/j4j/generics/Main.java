package ru.j4j.generics;

public class Main {
    public static void main(String[] args) {
        final Tuple<String> stringTupleFirst = new Tuple<>("l", "r");
        final Tuple<Integer> integerTuple = new Tuple<>(1, 2);
        final Tuple<SuperClass> superClassTuple = new Tuple<>(new SuperClass(), new SuperClass());
        System.out.println(stringTupleFirst.getLeft());
        System.out.println(integerTuple.getRight() + 15);
        System.out.println(superClassTuple.getRight());
    }

    private static class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }
}
