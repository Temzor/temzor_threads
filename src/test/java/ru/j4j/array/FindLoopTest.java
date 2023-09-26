package ru.j4j.array;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int el = 2;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

}