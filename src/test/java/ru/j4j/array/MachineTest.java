package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MachineTest {
    @Test
    public void whenMoneyEqualsPrice() {
        int money = 100;
        int price = 100;
        int[] result = Machine.change(money, price);
        int[] expected = {};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price21() {
        int money = 50;
        int price = 21;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 10, 5, 2, 2};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenMoney50Price32() {
        int money = 50;
        int price = 32;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void testChangeExactPayment() {
        int[] result = Machine.change(50, 50);
        assertThat(result).isEmpty();
    }

    @Test
    void testChangeWithChange() {
        int[] result = Machine.change(50, 33);
        assertThat(result).containsExactly(10, 5, 2);
    }

    @Test
    void testChangeMinimumCoins() {
        int[] result = Machine.change(50, 42);
        assertThat(result).containsExactly(5, 2, 1);
    }

    @Test
    void testChangeNoChange() {
        int[] result = Machine.change(100, 100);
        assertThat(result).isEmpty();
    }

    @Test
    void testChangeInsufficientFunds() {
        assertThatThrownBy(() -> Machine.change(50, 60))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Money provided is less than the price.");
    }
}