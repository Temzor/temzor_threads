package ru.j4j.array;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    public static int[] change(int money, int price) {
        if (money < price) {
            throw new IllegalArgumentException("Money provided is less than the price.");
        }

        int[] coins = {10, 5, 2, 1};
        List<Integer> result = new ArrayList<>();
        int change = money - price;

        for (int coin : coins) {
            while (change >= coin) {
                change -= coin;
                result.add(coin);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}