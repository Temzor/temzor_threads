package ru.j4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        return first >= second && first >= third ? first
                : second > first && second > third ? second : third;
    }
}
