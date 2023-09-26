package ru.j4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Length array ages is: " + ages.length);
        System.out.println("Length array surnames is: " + surnames.length);
        System.out.println("Length array prices is: " + prices.length);
    }
}
