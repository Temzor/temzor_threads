package ru.code.eight;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumArraysTest {
    @Test
    void testSumArrays() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(110).isEqualTo(SumArrays.arrayPlusArray(a, b));
    }

}