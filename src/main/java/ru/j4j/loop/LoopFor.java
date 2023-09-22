package ru.j4j.loop;

public class LoopFor {
    public static int loop(int index) {
        int sum = 0;
        for (int i = 0; i <= index; i++) {
            sum += i;
        }
        return sum;
    }
}
