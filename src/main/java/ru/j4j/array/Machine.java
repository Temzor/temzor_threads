package ru.j4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        while (money > price) {
            for (int i = 0; i < coins.length;) {
                if (price + coins[i] <= money) {
                    rsl[i] = coins[i];
                    money -= coins[i];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
