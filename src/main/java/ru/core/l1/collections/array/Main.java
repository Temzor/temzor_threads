package ru.core.l1.collections.array;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayListE arrayListE = new ArrayListE();
        arrayListE.add("Nick");
        arrayListE.add("Bic");
        arrayListE.add("Soj");
        arrayListE.add("Scel");
        arrayListE.add("Morlan");
        arrayListE.add("Nurlan");
        arrayListE.add("Girat");

        arrayListE.remove("Girat");
        arrayListE.remove("Soj");
        arrayListE.remove("Sof");

        for (int i = 0; i < arrayListE.getSize(); i++) {
            System.out.println(arrayListE.get(i));
        }

        arrayListE.add("Sol");
        arrayListE.add("Vum");
        arrayListE.add("Trail");
        arrayListE.add("Jorg");
        arrayListE.add("Bizon");
        arrayListE.add("Bread");

        for (int i = 0; i < arrayListE.getSize(); i++) {
            System.out.println(arrayListE.get(i));
        }

        for (int i = 1; i <= 100; i++) {
            arrayListE.add("Git " + i);
        }

        for (int i = 0; i < arrayListE.getSize(); i++) {
            System.out.println(arrayListE.get(i));
        }
        arrayListE.remove(2);

        for (int i = 0; i < arrayListE.getSize(); i++) {
            System.out.println(arrayListE.get(i));
        }
    }
}
