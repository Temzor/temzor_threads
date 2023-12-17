package ru.j4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftSplit = left.split(". ");
        String[] rightSplit = right.split(". ");
        int leftInt = Integer.parseInt(leftSplit[0]);
        int rightInt = Integer.parseInt(rightSplit[0]);
        return Integer.compare(leftInt, rightInt);
    }

    private int[] values;

    public int[] sort(int[] values) {
        this.values = values;
        return values;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {
        LexSort ar = new LexSort();
        final int[] immutable = {1};
        final int[] ri = ar.sort(immutable);
        ri[0] = -1;
        ar.echo();
    }
}
