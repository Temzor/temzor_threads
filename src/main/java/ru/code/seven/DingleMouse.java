package ru.code.seven;

public class DingleMouse {
    public static long[] clonewars(final int kataPerDay) {
        int numberOfClones = 1;
        int numberOfKataSolvedByClones = 0;
        int numberOfKatasPerDay = kataPerDay;

        for (int i = 1; i <= kataPerDay; i++) {
            numberOfKataSolvedByClones += numberOfClones * numberOfKatasPerDay;
            numberOfClones *= 2;
            numberOfKatasPerDay--;
        }

        return kataPerDay < 1 ? new long[] {1, 0} : new long[] {numberOfClones / 2, numberOfKataSolvedByClones};
    }
}
