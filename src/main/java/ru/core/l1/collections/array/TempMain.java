package ru.core.l1.collections.array;

public class TempMain {
    public static void main(String[] args) throws Exception {
        TempArrayList tempArrayList = new TempArrayList();
        tempArrayList.add("Nick");
        tempArrayList.add("Bic");
        tempArrayList.add("Soj");
        tempArrayList.add("Scel");
        tempArrayList.add("Morlan");
        tempArrayList.add("Nurlan");
        tempArrayList.add("Girat");

        tempArrayList.remove("Girat");
        tempArrayList.remove("Soj");
        tempArrayList.remove("Sof");

        for (int i = 0; i < tempArrayList.getSize(); i++) {
            System.out.println(tempArrayList.get(i));
        }

        tempArrayList.add("Sol");
        tempArrayList.add("Vum");
        tempArrayList.add("Trail");
        tempArrayList.add("Jorg");
        tempArrayList.add("Bizon");
        tempArrayList.add("Bread");

        for (int i = 0; i < tempArrayList.getSize(); i++) {
            System.out.println(tempArrayList.get(i));
        }

        for (int i = 1; i <= 100; i++) {
            tempArrayList.add("Git " + i);
        }

        for (int i = 0; i < tempArrayList.getSize(); i++) {
            System.out.println(tempArrayList.get(i));
        }
        tempArrayList.remove(2);

        for (int i = 0; i < tempArrayList.getSize(); i++) {
            System.out.println(tempArrayList.get(i));
        }
    }
}
